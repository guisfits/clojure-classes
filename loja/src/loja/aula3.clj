(ns loja.aula3
  (:require [loja.db :as l.db]))

(println (l.db/todos-os-pedidos)


(println (group-by :usuario (l.db/todos-os-pedidos)))
