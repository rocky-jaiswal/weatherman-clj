(ns weatherman-clj.core
  (:require [weatherman-clj.city :as city])
  (:require [weatherman-clj.parser :as parser])
  (:gen-class))

(defn pretty-print [matches]
  (map (fn [match] (str (get match "_id")
                       " : "
                       (get match "name")
                       " "
                       (get match "country")
                       "\n")) matches))

(defn work []
  (let [city-id (read-line)]
    (println "Fetching the weather ...")
    (println (parser/get-temperature city-id))))

(defn -main
  "Find the matching cities and fetch the weather"
  [& args]
  (println "Finding matches for your city - ")
  (print (pretty-print (city/find-matches (first args))))
  (print "Please type the city's id - ")
  (flush)
  (work))
