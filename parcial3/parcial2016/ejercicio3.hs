{-
3.- Empleando el lenguaje Haskell, defina una función recursiva que calcule el producto de los números que se encuentren en una lista. 
Ejemplo [1,3,5,6] el producto es 90.
-}

calcularProd :: [Int] -> Int
calcularProd [] = 1 --caso base
calcularProd (x:xs) = x * calcularProd xs --caso recursivo