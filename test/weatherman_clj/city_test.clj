(ns weatherman-clj.city-test
  (:require [clojure.test :refer :all]
            [weatherman-clj.city :refer :all]))

(deftest test-city-fetch
  (testing "city fetching works"
    (is (= 37 (count (find-matches "Berlin"))))))
