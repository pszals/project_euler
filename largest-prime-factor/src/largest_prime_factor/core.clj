(ns largest-prime-factor.core)

(defn prime-factors [n] 
  (loop [number n factors [] divisor 2]
    (if (< number 2)
      factors
      (if (zero? (mod number divisor))
        (recur (/ number divisor) (conj factors divisor) divisor)
        (recur number factors (inc divisor))
      ))))

(defn max-prime [n] 
  (apply max (prime-factors n)))
