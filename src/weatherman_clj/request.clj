(ns weatherman-clj.request
  (:require [clj-http.client :as client])
  (:require [weatherman-clj.config :as config]))

(defn get-weather [city-id]
  (client/get "http://api.openweathermap.org/data/2.5/weather"
              {:query-params
               {"id" city-id,
                "units" "metric",
                "appid" (config/fetch :api-key)}
               }))
