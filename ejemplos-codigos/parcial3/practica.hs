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

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

misterio1 :: (Eq a , Num b) => a -> a -> b -> b
misterio1 x y z = if x == y then z + 1 else z

misterio2 :: (Num a , Ord a) => [a] -> a -> [a]
misterio2 x y = [ z * 2 | z <- x , z > y ]

misterio3 :: Ord a => a -> a -> [a] -> a
misterio3 x y z = if x > y then head z else y

misterio4 :: Ord a => a -> [a] -> [Bool]
misterio4 x y = map (> x) y

misterio5 :: Integral a => (a -> b) -> [a] -> [b]
misterio5 f xs = map f (filter even xs)

misterio6 :: Bool -> a -> [a]
misterio6 x y = if x then [y] else []

misterio7 :: Ord a => (a -> b) -> a -> [a] -> [b]
misterio7 f x ys = map f (filter (> x) ys)

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

contarElementos:: [a] -> Int
contarElementos [] = 0
contarElementos (_:xs) = 1 + contarElementos xs

{-
Te piden definir una función recursiva llamada duplicarElementos que reciba una lista de enteros ([Int]) y devuelva una nueva lista donde cada número fue multiplicado por 2
sin usar map, únicamente usando patrones ([] y (x:xs)).

Por ejemplo: duplicarElementos [1, 2, 3] ➔ Debe devolver [2, 4, 6]
-}

duplicarElementos :: Num a => [a] -> [a]
duplicarElementos [] = []
duplicarElementos (x:xs) = (x * 2) : duplicarElementos xs

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

-- Listas por Comprension 

doblesPares :: [Int]
doblesPares = [ x * 2 | x <- [1..10] , even x ]

combinar :: [(Int , Char)]
combinar = [ (x , c) | x <- [1 , 2] , c <- ['a' , 'b'] ]

{-
Definí una función llamada triplesMayores usando una lista por comprensión.
Entrada: Recibe un número entero n y una lista de enteros xs.
Comportamiento: Devuelve una lista con los elementos de xs que sean estrictamente mayores a n
pero multiplicados por 3.

Ejemplo de prueba: triplesMayores 5 [2, 5, 8, 10] ➔ Debe devolver [24, 30].
-}

triplesMayores :: Int -> [Int] -> [Int]
triplesMayores n xs = [ x * 3 | x <- xs , x > n ]

{-
Escribí la función soloParesPositivos usando lista por comprensión.
Entrada: Una lista de enteros xs.
Comportamiento: Devuelve únicamente los números que sean pares (usando even) 
y mayores a 0 (positivos), sin modificar su valor.

Ejemplo: soloParesPositivos [-4, -2, 0, 3, 4, 6] ➔ Debe devolver [4, 6].
-}

soloParesPositivos :: [Int] -> [Int]
soloParesPositivos xs = [ x | x <- xs , even x , x > 0]

{-
Definí la función descuentosEspeciales utilizando únicamente una lista por comprensión.
Entrada: Una lista de precios de tipo [Float].
Comportamiento: Filtra los precios que sean estrictamente mayores a 1000 
y calcula para cada uno su precio con un 20% de descuento (multiplicando por 0.8).

Ejemplo de prueba: descuentosEspeciales [500.0, 1200.0, 800.0, 2000.0] ➔ Debe devolver [960.0, 1600.0].
-}

descuentosEspeciales:: [Float] -> [Float]
descuentosEspeciales xs = [ x * 0.8 | x <- xs , x > 1000 ]