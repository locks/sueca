(ns sueca.deck-test
  (:require [clojure.test :refer :all]
            [sueca.deck :refer :all]))

(deftest calculate-points-in-round
  (testing "Cards with no points"
    (is (= 0 (calculate-points [{:rank :two}
                                {:rank :three}
                                {:rank :four}
                                {:rank :five}
                                {:rank :six}]))))
  (testing "A Queen"
    (is (= 2 (calculate-points [{:rank :two}
                                {:rank :three}
                                {:rank :queen}
                                {:rank :five}
                                {:rank :six}]))))
  (testing "A Jack"
    (is (= 3 (calculate-points [{:rank :two}
                                {:rank :three}
                                {:rank :four}
                                {:rank :jack}
                                {:rank :six}]))))
  (testing "A King"
    (is (= 4 (calculate-points [{:rank :two}
                                {:rank :king}
                                {:rank :four}
                                {:rank :five}
                                {:rank :six}]))))
  (testing "A 7"
    (is (= 10 (calculate-points [{:rank :two}
                                 {:rank :three}
                                 {:rank :four}
                                 {:rank :five}
                                 {:rank :six}
                                 {:rank :seven}]))))
  (testing "An Ace"
    (is (= 11 (calculate-points [{:rank :ace}
                                 {:rank :three}
                                 {:rank :four}
                                 {:rank :five}
                                 {:rank :six}]))))
  (testing "A Queen and a Jack")
    (is (= 5 (calculate-points [{:rank :two}
                                {:rank :three}
                                {:rank :four}
                                {:rank :jack}
                                {:rank :queen}])))
  (testing "Full deck"
    (is (= 120 (calculate-points full)))))
