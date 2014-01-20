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
  {:tricks []
   :trump (peek shuffled-deck)
   :players (deal-cards (reverse shuffled-deck) 4)})


(setup-table play-deck)

