(ns rules.some-ruleset
  (:require [clara.rules :as r])
  (:import [com.clara.example.models
            ModelA
            ModelB]))

(r/defrule model-a-rule
  [ModelA
   (= ?x x)
   (= ?y y)]
  =>
  (r/insert! (ModelB. true (str "pos: " ?x ", val: " ?y) )))

(r/defquery get-b
  []
  [?b <- ModelB])
