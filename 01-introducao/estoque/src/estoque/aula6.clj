(ns estoque.aula6)

(def pedido { :mochila { :quantidade 2, :preco 80 }
             :camiseta { :quantidade 3, :preco 40 }
             :chaveiro { :quantidade 1 }})

(defn preco-dos-produtos [[_ valor]]
  (* (:quantidade valor) (:preco valor)))

(defn preco-total-do-produto [produto]
  (* (:quantidade produto) (:preco produto)))

(defn total-do-pedido
  [pedido]
  (->> pedido
       vals
       (map preco-total-do-produto)
       (reduce +)))

; (println (total-do-pedido pedido))

(defn gratuito? [item]
  (<= (get item :preco 0) 0))

; (println (filter gratuito? (vals pedido)))

(def pago? (comp not gratuito?))

(println (pago? {:preco 0}))