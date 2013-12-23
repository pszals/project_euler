(ns smallest_multiple.core-spec
  (:require [speclj.core :refer :all]
            [smallest_multiple.core :refer :all]))

(describe "smallest multiple of all numbers from 1 to 20"
  (it "determines if a number is divisible by all numbers in a range"
    (should= true (divisible-by-all-in-range? 4 '(1 2)))))
