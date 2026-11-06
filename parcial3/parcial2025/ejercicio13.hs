/*
13. Definir una función promedio que obtenga el promedio de una lista de notas dadas. 
Se pide definir y utilizar las siguientes funciones:   
    - sumarNotas : devuelve la suma de las notas de la lista de notas. (Haga uso de la recursividad)   
    - contarNotas : devuelve la cantidad de notas de la lista de notas. (Haga uso de la recursividad)
*/

sumarNotas :: [Int] -> Int 
sumar [] = 0
sumarNotas (x:xs) = x + sumarNotas xs

contarNotas :: [Int] -> Int 
contarNotas [] = 0
contarNotas (x:xs) = 1 + contarNotas xs

promedio :: [Int] -> Float
promedio [] = 0.0
promedio xs = fromIntegral (sumarNotas xs) / fromIntegral (contarNotas xs)