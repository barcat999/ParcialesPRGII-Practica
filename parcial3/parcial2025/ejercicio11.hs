/*
11. Defina una función para determinar el mayor de dos números. 
Luego, usando esta función, defina una nueva "maximode3", que dado 3 números enteros devuelva el mayor de ellos. 
Utilice el concepto de aplicación parcial.
*/

numeroMayor :: Int -> Int -> Int
numeroMayor a b
    | a > b = a
    | b > a = b
    | otherwise = a -- en caso de que sean iguales ambos numeros

maximode3 :: Int -> Int -> Int -> Int
maximode3 a b c = numeroMayor a (numeroMayor b c)