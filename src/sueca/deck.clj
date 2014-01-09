(ns sueca.deck)

(def ranks
  [:ace :two :three :four :five :six :seven :jack :king :ace])

(def suits
  [:spades :clubs :hearts :diamonds])


(def full
  (for [suit suits
        rank ranks]
    {:suit suit :rank rank}))
