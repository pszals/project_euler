(ns even-fibonacci.core-spec
  (:require [speclj.core :refer :all]
            [even-fibonacci.core :refer :all]))

(describe "Sum of all even fibonacci numbers under 4 million"
  (it "Creates a sequence of fibonacci numbers under 10"
    (should= '(1 2 3 5 8) (take-fib-less-than 10 (fibonacci))))
          
  (it "Sums all fibonacci numbers below 10"
    (should= 19 (sum-fibs-less-than 10)))

  (it "sums only even fibonacci numbers below 4 million"
    (should= 4613732 (sum-even-fibs-less-than 4000000))))
  
