   

 ; define function which checks if number is prime or not
   (defn prime-Noman? [n]
  (if (even? n) false
      (let [root (num (int (Math/sqrt n)))]
	(loop [i 3]
	  (if (> i root) true
	      (if (zero? (mod n i)) false
		  (recur (+ i 2))))))))
              

; this function basically calls the prime? function from given paramters
(defn prime-seq-Noman [n1 n2]
  (filter prime? (range n1 (+ 1 n2))))

; this function will give the top 10 from bigger to small prime numbers
(defn doprimes-Noman [n1 n2]
  (def getSeq (take 10 (reverse (prime-seq n1 n2))))
  (doseq [s getSeq] (println s))
  (println (str "Total = "(reduce + getSeq)))
)
