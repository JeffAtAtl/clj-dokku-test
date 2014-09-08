(defproject clj-dokku-test "0.1.0-SNAPSHOT"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.8"]
                 [http-kit "2.1.16"]]
  :uberjar-name "clj-dokku-test.jar"
  :main clj-dokku-test.core
  :profiles
  {:uberjar {:aot :all}})
