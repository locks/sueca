(ns sueca.score)

(defn- team-index [player-index]
  (mod player-index 2))

(defn add-score
  [[team1 team2]
   new-score
   player-index]
  (let [team-nth (team-index player-index)]
    (if (= team-nth 0)
      [(+ team1 new-score) team2]
      [team1 (+ team2 new-score)])))
