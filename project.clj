(defproject weatherman-clj "0.1.0-SNAPSHOT"
  :description "WeatherMan in Clojure"

  :url "http://example.com/FIXME"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/data.json "0.2.6"]
                 [clj-http "2.0.0"]]

  :plugins [[lein-ancient "0.6.8"]]

  :main ^:skip-aot weatherman-clj.core

  :target-path "target/%s"

  :profiles {:uberjar {:aot :all}})
