esBisiesto :: Int -> Bool
esBisiesto anho
    | anho `mod` 400 == 0 = True
    | anho `mod` 100 == 0 = False
    | anho `mod` 4 == 0 = True
    | otherwise = False

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

-- Sumar los elementos de una lista de forma recursiva
sumarLista :: [Int] -> Int
sumarLista [] = 0                  -- Caso base: una lista vacía suma 0
sumarLista (x:xs) = x + sumarLista xs   -- Paso recursivo: suma la cabeza con la suma de la cola

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

signo :: (Ord a, Num a) => a -> String
signo x
    | x > 0 = "positivo"
    | x < 0 = "negativo"
    | otherwise = "cero"

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

-- Calcula el factorial usando recursividad
factorial :: Integer -> Integer
factorial 0 = 1                               -- 1. Caso Base: el factorial de 0 es 1
factorial n = n * factorial (n - 1)           -- 2. Caso Recursivo: multiplica N por el factorial del anterior

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

sumarHastaN :: Int -> Int
sumarHastaN 0 = 0                           -- Caso base: al llegar a 0, sumo 0 y corto
sumarHastaN n = n + sumarHastaN (n - 1)     -- Caso recursivo: sumo N con el resultado de los anteriores.

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

numeroMayor :: Int -> Int -> Int
numeroMayor a b 
    | a > b = a
    | b > a = b 
    | otherwise = a

maximode3 :: Int -> Int -> Int -> Int
maximode3 a b c = numeroMayor a (numeroMayor b c)

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

-- 1. Devuelve True si la lista tiene más de 3 elementos
esLarga :: [a] -> Bool
esLarga xs = length xs > 3

-- 2. Devuelve el primer elemento de la lista de forma segura.
-- Si la lista está vacía, devuelve 0.
primerElementoSeguro :: [Int] -> Int
primerElementoSeguro [] = 0
primerElementoSeguro (x:_) = x

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- Funcion Lambda

-- Forma tradicional
suma x y = x + y

-- Con lambda de varios argumentos
suma = \x y -> x + y

-- Con lambdas anidadas (Currificación en estado puro)
suma = \x -> \y -> x + y