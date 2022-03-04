(ns estoque.aula4)
; VETORES

(def precos [30 700 1000])

(get precos 1)
; Get retona nil, não exception quando o valor não é encontrado
(get precos 17 0)

; Adicionar novo elemento ao array
(conj precos 5)

; inc == ++
(inc 1)
(update precos 0 inc)

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

(map valor-descontado precos)
(range 10)
(filter even? (range 10))



