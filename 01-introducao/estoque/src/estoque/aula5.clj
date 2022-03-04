(ns estoque.aula5)

(def estoque { :moquila 10,
               :camiseta 5 })

(println "keys" (keys estoque))
(println "assoc" (assoc estoque :cadeira 3))

(def pedido { :mochila { :quantidade 2, :preco 80 }
              :camiseta { :quantidade 3, :preco 40 }})

(println (:mochila pedido))
(println (:quantidade {:mochila pedido}))

(println "Update-in" (update-in pedido [:mochila :quantidade] inc))
(println (-> pedido :mochila :quantidade))