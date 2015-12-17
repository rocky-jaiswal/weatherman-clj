(ns weatherman-clj.city)

(import '(java.io BufferedReader FileReader))

(def all-lines (atom []))

(defn find-matching-cities [city-name]
  (reset! all-lines [])
  (with-open [rdr (java.io.BufferedReader.
                   (java.io.FileReader. "resources/city_list.json"))]
    (doseq [seq (line-seq rdr)]
      (swap! all-lines (fn [current] (conj current seq)))))
  (filter (fn [line] (re-find (re-pattern city-name) line)) @all-lines))
