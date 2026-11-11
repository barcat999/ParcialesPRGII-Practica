{-
Dadas dos listas de números enteros, se pide definir por comprensión el producto cada
elemento de la primera lista por los elementos pares de la segunda lista.
Por ejemplo, para [5,7] y [8,6,7] se debe obtener [40,30,56,42].
-}

comprensionLista :: [Int] -> [Int] -> [Int]
comprensionLista l1 l2 = [x * y | x <- l1 , y <- l2 , even y]

------------------------------------------------------------------------------------------------------------------

{-
Definir un tipo de dato que represente a un jugador de futbol y luego realizar funciones que
nos permitan
    a. mostrar su nombre, puestos en los que se desempeña y cantidad de goles
    b. Saber si jugo en más de una posición
    c. Agregar una nueva posición en la que se desempeña
    d. Agregar goles a su marca de goles
    e. Decir si es considerado un goleador, para ello debe superar los 10 goles en su marca.
    f. Definir si puede jugar en la liga de veteranos, para ello la que puede participar si tiene
    entre 33 y 75 años.
-}

data Jugador = Jugador{

    nombre :: String,
    edad :: Int,
    posiciones :: [String],
    cantGoles :: Int

}deriving (Show)

mostrarJugador :: Jugador -> String
mostrarJugador j = nombre j ++ " juega de " ++ show (posiciones j) ++ " con " ++ show (cantGoles j) ++ " goles"

cantPosJugadas :: Jugador -> Bool
cantPosJugadas j = length(posiciones j) > 1

nuevaPos :: String -> Jugador -> Jugador
nuevaPos nuevoPuesto j = nuevoPuesto j {posiciones = nuevoPuesto j : posiciones j}

nuevosGoles :: Int -> Jugador -> Jugador
nuevosGoles golNuevo j = j {cantGoles = cantGoles j + golNuevo}

esGoleador :: Jugador -> Bool
esGoleador j 
    | cantGoles j > 10 = True
    | otherwise = False

esVeterano :: Jugador -> Bool
esVeterano j
    | edad j >= 33 && edad j <= 75 = True
    | otherwise = False

------------------------------------------------------------------------------------------------------------------

{-
Definir una función que reciba un precio en dólares, lo convierta a pesos argentinos (multiplicando por un tipo de cambio simulado de 1500) 
y finalmente lo formatee agregándole el signo $ adelante (ej: "\\$ 15390.0" usando la función show o concatenación)
-}

precioEnPesos :: Float -> String
precioEnPesos = (\n -> "$ " ++ show n) . (* 1500)

------------------------------------------------------------------------------------------------------------------

{-
Se pide analizar y completar con la parte declarativa las siguientes funciones
    a. esMayorDiferencia x y = x * 2 > y + 5
    b. funcionExtraña x y = esMayorDiferencia (not x) y
    c. combinar x y z = funcionAux (otraFuncion y z) x
    además se sabe que: combinar 10 True "hola" = False
    d. triplicarLista = map (*3)
    e. esPositivo = (> 0)
    f. transformarPares = map (even . (*2))
-}

esMayorDiferencia :: Int -> Int -> Bool
esMayorDiferencia x y = x * 2 > y + 5

funcionExtraña :: Bool -> Int -> Bool
funcionExtraña x y = esMayorDiferencia (not x) y

combinar :: Int -> Bool -> String -> Bool -- o combinar :: a -> b -> c -> Bool 
combinar x y z = funcionAux (otraFuncion y z) x

triplicarLista :: [Int] -> [Int]
triplicarLista = map (*3)

esPositivo :: Int -> Bool
esPositivo = (> 0)

transformarPares :: [Int] -> [Bool]
transformarPares = map (even . (*2))