{-
3.- Empleando el lenguaje Haskell, defina una función recursiva que calcule el producto de los números que se encuentren en una lista. 
Ejemplo [1,3,5,6] el producto es 90.
-}

filtrarPares:: [Int] -> [Int]
filtrarPares [] = [] -- caso base. si pasan una lista vacia termina
filtrarPares (x:xs)
    | even x = x : filtrarPares xs
    | otherwise = filtrarPares xs