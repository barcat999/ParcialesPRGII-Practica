-- 1. El de Inferencia (Saca la firma):

operar :: (Num a , Eq a) => a -> a -> Bool
operar x y = (x - 1) == y

-- 2. El de Recursividad (Sin case of):

miLongitud :: [a] -> Int
miLongitud [] = 0
miLongitud (x:xs) = x + miLongitud xs

-- 3. El de Tipos (data y Registros)

data Auto = Auto{
    
    marca :: String ,
    puertas :: Int
    
}deriving(show)

-- 4. El de Orden Superior (map / filter)
filter (\x -> mod x 2 /= 0) xs

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

-- Ejercicio 1: Inferencia de Tipos
{-Sacá la firma polimórfica más general (aplicando el método de adentro hacia 
afuera y agregando las restricciones que necesites):-}

descuento :: (Num a , Ord a) => a -> a -> Bool
descuento x y = (x - y) > 100 && y > 0

-- Ejercicio 2: Recursividad Pura (Sin case of)
{-
Definí la función todosPositivos, que reciba una lista de números y devuelva True 
si todos los elementos son estrictamente mayores a 0, o False en caso contrario.
(Pista: pensá qué debe devolver el caso base si la lista se vacía por completo 
sin encontrar ningún número negativo).
-}

todosPositivos :: (Num a , Ord a) => [a] -> Bool
todosPositivos [] = True
todosPositivos (x:xs) = x > 0 && todosPositivos xs


-- Ejercicio 3: Orden Superior y Aplicación Parcial
{-
Dada la siguiente lista de diccionarios/tuplas que representan productos con su nombre y su precio: 
productos = [("Remera", 12000), ("Pantalon", 25000), ("Medias", 4000)].
Usando filter y composición (.), armá una función llamada filtrarBaratos que se
quede únicamente con los productos cuyo precio sea menor a 15000. 
(Ayuda: recordá usar fst o snd para extraer el precio de la tupla).
-}

filtrarBaratos :: [(String, Float)] -> [(String, Float)]
filtrarBaratos productos = filter ((< 15000) . snd) productos

{-
Te dan una lista de números enteros, y el objetivo es armar una función llamada procesarImpares que haga lo siguiente:
    1. Filtre únicamente los números que sean impares.
    2. A cada uno de esos números impares que sobrevivió al filtro, lo multiplique por 3
-}

procesarImpares :: [Int] -> [Int]
procesarImpares ls = [ x * 3 | x <- ls , x `mod` 2 /= 0 ] -- ó odd x
