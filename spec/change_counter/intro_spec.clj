(ns change-counter.intro-spec
  (:require [speclj.core :refer :all]
            [change-counter.intro :refer :all]))

(describe "truthiness"
  (it "tests if true-or-false returns true"
    (should (true-or-false))))

(describe "Understanding Speclj Components"
  (before-all
    (println "Starting testing"))

  (after-all
    (println "finished testing"))

  (before
    (println "Before each test"))

  (after
    (println "After each test"))

  (it "confirms 4 plus 1 equals 5"
    (println "Running first test")
    (should (equals-5? (+ 4 1))))

  (it "confirms 4 plus 2 isn't 5"
    (should-not (equals-5? (+ 4 2))))

  (it "evaluates statements inline too"
    (should= 6 (+ 4 2)))
)
(run-specs)
