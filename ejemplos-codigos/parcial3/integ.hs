{-
Ejercicio 4 (Haskell — Parcial 3: Composición y Recursión)

    1. Dado data Libro = Libro { titulo :: String, paginas :: Int }, definí usando composición de funciones (.) 
    la función esExtenso :: Libro -> Bool que devuelva True si el libro tiene más de 300 páginas ((> 300)).

    2. Escribí de forma recursiva con pattern matching ([] y (x:xs)) la función contarPares :: [Int] -> Int 
    que cuente cuántos números pares (even x) hay en una lista.
-}

-- 1.
esExtenso :: Libro -> Bool
esExtenso = (> 300) . paginas

-- 2.
contarPares :: [Int] -> Int
contarPares [] = 0
contarPares (x:xs)
    | even x    = 1 + contarPares xs
    | otherwise = contarPares xs