/*
10. Haciendo uso de la recursividad, calcule el producto de los números que representan los extremos de un intervalo incluidos ellos. 
Por ejemplo dado el intervalo [1,4], su producto es: 1*2*3*4= 24
*/

productoIntervalo :: Int -> Int -> Int
productoIntervalo a b
    | a > b = 1 -- caso base
    | otherwise = a * productoIntervalo(a + 1) b -- caso recursivo