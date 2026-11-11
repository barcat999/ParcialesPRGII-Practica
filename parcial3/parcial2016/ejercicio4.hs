{-
4.- Definir la función en lenguaje Haskell esMultiploDe para determinar si dados dos números a y b, a es múltiplo de b. 
La solución planteada debe estar implementada mediante el uso de guardas.
-}

esMultiploDe :: Int -> Int -> Bool
esMultiploDe a b
    | mod a b == 0 = True
    | otherwise = false