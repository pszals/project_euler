(ns largest-prime-factor.core-spec
  (:require [speclj.core :refer :all]
            [largest-prime-factor.core :refer :all]))

(describe "prime factors of n"
  (it "factors 1"
    (should= [] (prime-factors 1)))
  
  (it "factors 2"
    (should= [2] (prime-factors 2)))

  (it "factors 3"
    (should= [3] (prime-factors 3)))

  (it "factors 4"
    (should= [2 2] (prime-factors 4)))

  (it "factors 5"
    (should= [5] (prime-factors 5)))

  (it "factors 6"
    (should= [2 3] (prime-factors 6)))

  (it "factors 8"
    (should= [2 2 2] (prime-factors 8)))

  (it "factors 9"
    (should= [3 3] (prime-factors 9)))
          )

(describe "gets max prime factor"
  (it "gets the max factor of 10"
    (should= 6857 (max-prime 600851475143))))
