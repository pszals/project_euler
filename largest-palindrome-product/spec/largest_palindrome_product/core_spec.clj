(ns largest-palindrome-product.core-spec
  (:require [speclj.core :refer :all]
            [largest-palindrome-product.core :refer :all]))

(describe "checking for a palindromic number"
  (it "determines if a number is a palindrome"
    (should= false (palindrome? "123"))
    (should= true (palindrome? "1221"))))

(describe "multiplying numbers in two ranges"
  (it "multiplies all numbers in two ranges against one another"
    (should= '(1 2 2 4) (cartesian-product (range 1 3)))))

(describe "largest-palindrome-product"
  (it "takes two ranges of numbers and finds the largest palindrome product"
    (should= 9009 (largest-palindrome-product (range 100 1000)))))


