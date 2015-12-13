(ns weatherman-clj.core
  (:require [weatherman-clj.request :as req])
  (:require [clojure.data.json :as json])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn make-request [city]
  (req/get-weather ""))

(defn parse-response [response]
  (json/read-str (get response :body)))

(defn get-temparature [city]
  (get (get (parse-response (make-request city)) "main") "temp"))
