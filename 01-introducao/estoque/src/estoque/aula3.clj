(ns estoque.aula3)

(defn valor-descontado
  "Retorna o valor com desconto de 10% do valor bruto"
  [valor-bruto]
  (if (> valor-bruto 100)
    (let [taxa-de-desconto  (/ 10 100)
         desconto           (* valor-bruto taxa-de-desconto)]
        (- valor-bruto desconto))
    valor-bruto))

(defn aplicar-desconto?
  [valor-bruto]
  (> valor-bruto 100))

(println "Valor descontado é de" (valor-descontado 1000))