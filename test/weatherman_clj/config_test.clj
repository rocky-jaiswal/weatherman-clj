(ns weatherman-clj.config-test
  (:require [clojure.test :refer :all]
            [weatherman-clj.config :refer :all]))

(deftest test-config
  (testing "the api key is present"
    (is (not (nil? (fetch :api-key))))))
