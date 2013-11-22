(ns even-fibonacci.core)
  (defn fibonacci []
    ((fn recursive-fib [a b] 
      (lazy-seq (cons 
        a 
        (recursive-fib b (+ a b))))) 
     1 2))

  (defn take-fib-less-than [n fibonacci-sequence] 
    (take-while 
      #(< % n)  fibonacci-sequence)) 

  (defn sum-fibs-less-than [n]
    (reduce + (take-fib-less-than n (fibonacci))))

  (defn sum-even-fibs-less-than [n]
    (reduce +
      (filter
        #(= (rem % 2) 0)
        (take-fib-less-than n (fibonacci)))))
