(ns clj-dokku-test.core
  (:require [compojure.core :refer :all]
            [org.httpkit.server :refer [run-server]])
  (:gen-class))

(defroutes kaavat
  (GET "/" [] "Hello World"))

(defn get-port []
  (if-let [port (System/getenv "PORT")]
    (Integer/valueOf port)
    5000))

(defn -main []
  (let [port (get-port)]
    (print "Running on port" port)
    (run-server kaavat {:port port})))
