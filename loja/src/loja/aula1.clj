(ns loja.aula1)

(defn meu-mapa
  [funcao sequencia]
  (let [primeiro (first sequencia)]
  (if (not (nil? primeiro))
    (do
      (funcao primeiro)
      (recur funcao (rest sequencia))))))

(meu-mapa println ["guilherme" "juliana" "roseli" "gilvan"])