/*
12. Se pide analizar y completar con la parte declarativa las siguientes funciones:
    - duplicarLista = map (*2)   
    - esMuchoMayor n m = n - m > 10
*/

-- inciso a
duplicarLista :: [Int] -> [Int]
duplicarLista = map(*2)

-- inciso b
esMuchoMayor :: Int -> Int -> Bool
esMuchoMayor n m = n - m > 10