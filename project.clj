(defproject core.matrix.complex "0.0.1-SNAPSHOT"
  :description "Complex numerical arrays in Clojure, as an extension to core.matrix"
  :url "https://github.com/mikera/core.matrix.complex"
  :dependencies [[org.clojure/clojure "1.7.0-RC1"]
                 [net.mikera/core.matrix "0.34.0"]
                 [complex "0.1.2"]
                 [net.mikera/clojure-utils "0.6.1"]
                 [net.mikera/core.matrix.stats "0.6.0"]
                 [org.clojure/tools.trace "0.7.9"] ;;TODO this should be under dev profile
                 [org.clojure/math.numeric-tower "0.0.4"]]

  :profiles {:dev {:dependencies [[net.mikera/vectorz-clj "0.29.0"]
                                  [net.mikera/cljunit "0.3.1"]
                                  [net.mikera/core.matrix.testing "0.0.1"]]}}

  :source-paths ["src/main/clj"]
  :test-paths ["src/test/clj"])
