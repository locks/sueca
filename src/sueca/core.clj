(ns sueca.core
  (:require [sueca.deck]))

(defn first-player
  [players]
  (first players))

(defn setup-table
  "Setups up the playing table. This involves dealing cards to the players."
  [shuffled-deck]
   :trunfo (peek shuffled-deck)
  {:tricks []
   :players (deal-cards (reverse shuffled-deck) 4)})

(defn deal-cards
  "Deals cards to playrs"
  [shuffled-deck number-of-players]
  (partition (/ (count shuffled-deck) number-of-players) shuffled-deck))

(setup-table play-deck)

