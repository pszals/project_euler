(ns largest-palindrome-product.core)

(defn palindrome? [number]
  (let [reversed (clojure.string/reverse (str number))
        number_as_str (str number)]
  (= reversed number_as_str)))

(defn cartesian-product [range-to-multiply]
  (for [x range-to-multiply
        y range-to-multiply]
    (* x y)))

(defn largest-palindrome-product [a-range]
  (let [products (cartesian-product a-range)]
    (apply max (filter palindrome? products))))
