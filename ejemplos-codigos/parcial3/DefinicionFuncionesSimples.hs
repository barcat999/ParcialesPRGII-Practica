-- Firma: recibe un Entero y devuelve un Entero
sumarCinco :: Int -> Int
sumarCinco x = x + 5

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

-- Firma: recibe dos enteros (base y altura) y devuelve un entero (el área)
areaRectangulo :: Int -> Int -> Int
areaRectangulo base altura = base * altura

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

-- Calcula el cuadrado de un número
cuadrado :: Num a => a -> a
cuadrado x = x * x

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

-- Retorna True si la edad es mayor o igual a 18
esMayorDeEdad :: Int -> Bool
esMayorDeEdad edad 
    | edad >= 18 = True
    | otherwise  = False

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

-- Perímetro: 2 * (base + altura)
perimetroRectangulo :: Num a => a -> a -> a
perimetroRectangulo base altura = 2 * (base + altura)

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

-- 1. Matemática con decimales (Float)
-- Convierte grados Celsius a Fahrenheit.
celsiusAFahrenheit :: Float -> Float
celsiusAFahrenheit c = (c * 1.8) + 32

-- 2. Uso de la restricción 'Eq' (Igualdad)
-- Compara dos valores del mismo tipo 'a' y devuelve True si son idénticos.
sonIguales :: Eq a => a -> a -> Bool
sonIguales x y = x == y

-- 3. Lógica booleana simple sin guardas
-- Usa el operador '||' (OR lógico) para evaluar múltiples condiciones en una sola línea.
esFinDeSemana :: String -> Bool
esFinDeSemana dia = dia == "Sabado" || dia == "Domingo"