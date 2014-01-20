(ns sueca.core
  (:require [sueca.deck :as deck]
            [sueca.score :as score]))

(defn first-player
  [players]
  (first players))

(defn deal-cards
  "Deals cards to playrs"
  [shuffled-deck number-of-players]
  (partition (/ (count shuffled-deck) number-of-players) shuffled-deck))

(defn setup-table
  "Setups up the playing table. This involves dealing cards to the players."
  [shuffled-deck]
  {:tricks   []
   :trump   (peek shuffled-deck)
   :players (deal-cards (reverse shuffled-deck) 4)
   :score   [0 0]
   :table   ()})

(defn add-points
  [{:keys [trump score] :as table}]
  (let [points (deck/calculate-points (get table :table))
        winner (:player (first (deck/highest-card (get table :table) trump)))]
    (assoc-in table [:score] (score/add-score score points winner))))



(setup-table play-deck)
