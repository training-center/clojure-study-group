(ns hello-world-n-times.core
  (:gen-class))

(defn hello-world-n-time 
  [times]
  (loop [n 1]
    (println "Hello World.")
    (if (>= n times)
      (println "Flwww!!!")
      (recur (inc n))))
  )

(defn -main
  [& args]
  (hello-world-n-time (do (print "What's your name? ") (flush) (Integer/parseInt (read-line)))))
