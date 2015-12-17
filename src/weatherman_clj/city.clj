(ns weatherman-clj.city)

(import '(java.io BufferedReader FileReader))

(defn find-matching-cities [city-name]
  (let [matches (atom [])]
    (with-open [rdr (java.io.BufferedReader.
                     (java.io.FileReader. "resources/city_list.json"))]
      (doseq [seq (line-seq rdr)]
        (if (re-find (re-pattern city-name) seq)
          (swap! matches (fn [current] (conj current seq))))))
    @matches))
