(ns change-counter.core-spec
  (:require [speclj.core :refer :all]
            [change-counter.core :refer :all]))

(describe "change-counter.core"
  (around [it]
    (with-out-str (it)))

  (it "tests the input of prompt"
    (should= "13"
      (with-in-str "13"
        (prompt "Enter amount of pennies"))))

  (it "tests the output of prompt"
    (should= "Where is my money?\n"
      (with-out-str (with-in-str "10"
        (prompt "Where is my money?"))))))
