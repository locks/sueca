(def sample-table
  {:tricks []
   :trump {:suit :spades, :rank :five}
   :players '(({:suit :clubs, :rank :three} {:suit :spades, :rank :ace} {:suit :clubs, :rank :queen} {:suit :spades, :rank :king} {:suit :spades, :rank :seven} {:suit :hearts, :rank :two} {:suit :spades, :rank :four} {:suit :spades, :rank :three} {:suit :hearts, :rank :ace})
             ({:suit :clubs, :rank :ace} {:suit :diamonds, :rank :three} {:suit :hearts, :rank :six} {:suit :diamonds, :rank :six} {:suit :hearts, :rank :seven} {:suit :clubs, :rank :seven} {:suit :diamonds, :rank :four} {:suit :diamonds, :rank :seven} {:suit :spades, :rank :six})
             ({:suit :clubs, :rank :five} {:suit :hearts, :rank :queen} {:suit :hearts, :rank :four} {:suit :clubs, :rank :four} {:suit :hearts, :rank :three} {:suit :spades, :rank :queen} {:suit :clubs, :rank :six} {:suit :hearts, :rank :jack} {:suit :hearts, :rank :king})
             ({:suit :clubs, :rank :two} {:suit :spades, :rank :jack} {:suit :hearts, :rank :five} {:suit :clubs, :rank :jack} {:suit :diamonds, :rank :two} {:suit :diamonds, :rank :jack} {:suit :clubs, :rank :king} {:suit :diamonds, :rank :queen} {:suit :diamonds, :rank :ace}))
   :score [0 0]
   :table '({:suit :spades :rank :five :player 0}
            {:suit :diamonds :rank :five :player 1}
            {:suit :spades :rank :two :player 2}
            {:suit :diamonds :rank :king :player 3})})
