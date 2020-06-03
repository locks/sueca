(ns sueca.deck)

(def ranks
  [:two :three :four :five :six :seven :queen :jack :king :ace])

(def suits
  [:spades :clubs :hearts :diamonds])

(def full
  (for [suit suits
        rank ranks]
    {:suit suit :rank rank}))

(def points
  {:ace   11
   :seven 10
   :king   4
   :jack   3
   :queen  2})

(defn calculate-points
  "Calculates the total points for a card collection"
  [cards]
  (let [ranks (map #(get %1 :rank) cards)]
    (reduce #(+ %1 %2)
            (map #(get points %1 0) ranks))))

(defn- sort-value
  [card trump]
  (let [rankValue (.indexOf ranks (get card :rank))
        trumpValue (if (= (card :suit) trump) 10 0)]
    (+ rankValue trumpValue)))


(defn highest-card
  "Returns highest card from a collection, including trumps"
  [cards trump]
  (sort-by #(sort-value %1 trump) cards))

(highest-card [{:rank :king :suit :clubs :player 0}
               {:rank :three :suit :spades :player 2}
               {:rank :two :suit :spades :player 1}
               {:rank :ace :suit :clubs :player 3}]
              :spades)
