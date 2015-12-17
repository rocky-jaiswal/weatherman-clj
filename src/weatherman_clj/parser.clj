(ns weatherman-clj.parser
  (:require [weatherman-clj.request :as req])
  (:require [clojure.data.json :as json]))

(defn- make-weather-request [city-id]
  (req/get-weather city-id))

(defn- parse-response [response]
  (json/read-str (get response :body)))

(defn get-weather [city-id]
  (parse-response (make-weather-request city-id)))

(defn get-temperature [city-id]
  (get (get-weather city-id) "main"))
