(ns weatherman-clj.request
  (:require [clj-http.client :as client])
  (:require [weatherman-clj.config :as config]))

(defn get-weather [city]
  (client/get "http://api.openweathermap.org/data/2.5/weather"
              {:query-params
               {"q" "Berlin,de",
                "units" "metric",
                "appid" (config/fetch :api-key)}
               }))
