(ns weatherman-clj.config
  (require [clojure.edn :as edn]))

(def app-config-file
  "resources/app_config.edn")

(defn app-config []
  (slurp app-config-file))

(defn fetch [key]
  (get (edn/read-string (app-config)) key))
