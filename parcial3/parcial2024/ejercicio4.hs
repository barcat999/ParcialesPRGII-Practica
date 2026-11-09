{- 
4. Define una función multiplicar que multiplique dos números; 
luego, utilizando la aplicación parcial, crear una función que duplique un número.
-}

multiplicar :: Int -> Int -> Int
multiplicar x y = x * y

multiNum :: Int -> Int
multiNum = multiplicar 2