(ns loja.aula2)

(defn conta

  ([elementos]
   (conta 0 elementos))

  ([total-ate-agora sequencia]
    (if (seq sequencia)
      (recur (inc total-ate-agora) (next sequencia))
      total-ate-agora)))

(println (conta ["guilherme" "juliana" "roseli" "gilvan"]))
(println (conta []))
