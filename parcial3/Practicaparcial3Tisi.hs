-- Práctica Parcial 3

-- Parcial 3 - 2025 - C1

{-
1) Haciendo uso de la recursividad, calcule el producto de los números que representan los extremos de un intervalo incluidos ellos. Por ejemplo dado el intervalo [1,4], su producto es: 1*2*3*4 = 24.
-}

productoIntervalo :: Integer -> Integer -> Integer
productoIntervalo x y
  | x == y = y
  | x < y  = x * productoIntervalo (x+1) y
  | otherwise = 1

{-
2) Defina una función para determinar el mayor de dos números. Luego, usando esta función, defina una nueva "maximoDe3", dado 3 números enteros devuelva el mayor de ellos. Utilice el concepto de aplicación parcial. 
-}

maximoDe2 :: Integer -> Integer -> Integer
maximoDe2 x y 
 | x >= y = x
 | otherwise = y

maximoDe3 :: Integer -> Integer -> Integer -> Integer
maximoDe3 x y z = ((maximoDe2 y).(maximoDe2 z)) x

{-
3) Se pide analizar y completar con la parte declarativa las siguientes funciones:
  - duplicarLista = map (*2): Aqui la función map está aplicada de manera parcial, ya que se le pasó un parámetro menos del que requiere (map recibe una lista y una función), duplicarLista queda definida como una nueva función en estilo point-free (sin parámetros a la izquierda) y devolveria la lista con todos sus elementos multiplicados por 2.

    duplicarLista :: Num a => [a] -> [a]

  - esMuchoMayor n m = n - m > 10: Devuelve Bool, True si la resta de (n-m) es mayor a 10 o False en caso contrario
   
    esMuchoMayor :: Integer -> Integer -> Bool
-}

{-
4) Definir una funcion promedio que obtenga el promedio de una lista de notas dadas. Se pide definir y utilizar las siguientes funciones:
  -sumarNotas: devuelve la suma de las notas de la lista de notas (haga uso de recursividad)
  - contarNotas: devuelve la cantidad de notas de la lista de notas (haga uso de recursividad)
-}

sumarNotas :: [Float] -> Float
sumarNotas [] = 0
sumarNotas (x : xs) = x + sumarNotas xs

contarNotas :: [Float] -> Integer
contarNotas [] = 0
contarNotas (x : xs) = contarNotas xs + 1

promedio :: [Float] -> Float
promedio [] = 0
promedio lista = (sumarNotas lista)/fromIntegral(contarNotas lista)

{-
5) Haciendo uso de la composición de funciones se pide determinar si la longitud del nombre de una persona es una cantidad par. Realice sus propias funciones que intervienen para determinar si es par. (no usar funciones del prelude)
-}

longitudNombre :: String -> Integer
longitudNombre [] = 0
longitudNombre (x : xs) = longitudNombre xs + 1

esMultiploDe2 :: Integer -> Bool
esMultiploDe2 n = (n `mod` 2) == 0

esPar :: String -> Bool
esPar nombre = (esMultiploDe2 . longitudNombre) nombre


-- Parcial 3 - 2024
{-
3) Implementa una función filtrarPares que filtre los números pares de una lista.
-}

filtrarPares :: [Integer] -> [Integer]
filtrarPares lista = filter even lista

{-
Con point-free: filtrarPares = filter even

Sin usar la función even:

filtrarPares :: [Integer] -> [Integer]
filtrarPares [] = []
filtrarPares (x : xs)
  | (x `mod` 2) == 0 = x : filtrarPares xs
  | otherwise        = filtrarPares xs
-}

{-
4) Define una función multiplicar que multiplique dos números; luego, utilizando la aplicación parcial, crear una función que duplique un número
-}

multiplicar :: Integer -> Integer -> Integer
multiplicar x y = x * y

duplicarNumero :: Integer -> Integer
duplicarNumero = multiplicar 2

{-
5) Usa una función lambda para crear una funcion que sume 10 a un numero

\x -> x + 10

-}

{-
6) Definan un tipo de dato Empleado con atributos como nombre y sueldo. Sobre ella se pide:
 - a) Definir una funcion sueldoMasBajo para encontrar el sueldo más bajo y otra sueldoMasAlto para encontrar al sueldo más alto dada una lista de empleados
 - b) Definir una funcion filtrarSueldoMayorA que filtre los sueldos mayores a un valor dado.
 - c) Tomando la lista del punto anterior, definir una función sueldoMasAltoFiltrado que retorne el sueldo más alto
NOTA: Hacer uso de funciones de orden superior, composicion y recursión. Las definiciones de las funciones deben tener la parte delclarativa
-}

data Empleado = Empleado {
  nombre :: String,
  sueldo :: Float
}

-- Datos de prueba
e1 = Empleado "Ana" 450000.0
e2 = Empleado "Pedro" 850000.5
e3 = Empleado "Lucía" 620000.0
e4 = Empleado "Carlos" 300000.0

misEmpleados :: [Empleado]
misEmpleados = [e1, e2, e3, e4]

-- a:

sueldoMasBajo :: [Empleado] -> Float
sueldoMasBajo empleados = minimum (map sueldo empleados)

sueldoMasAlto :: [Empleado] -> Float
sueldoMasAlto empleados = maximum (map sueldo empleados)

-- b:
sueldoMayor :: Float -> Float -> Bool
sueldoMayor tope sueldo = sueldo >= tope

filtrarSueldoMayorA :: [Empleado] -> Float -> [Float]
filtrarSueldoMayorA empleados tope = (filter (sueldoMayor tope) . map sueldo) empleados

-- c:
sueldoMasAltoFiltrado :: [Empleado] -> Float -> Float
sueldoMasAltoFiltrado empleados tope = maximum (filtrarSueldoMayorA empleados tope)
 
-- Parcial 3 - 2023

{-
5) a. Definir una función Sumatoria tal que devuelva la suma de todos los numeros comprendidos entre dos valores ingresados como argumentos.
Se pide definir dos versiones de la función, una empleando guardas, y la otra empleando el condicional if.
En ambos casos hacer uso de la recursividad.
Ejemplo: sumatoria 3 10 = 52 - sumatoria(10,3) = 52 - sumatoria (3,3) = 3
-}

-- Con guardas:
sumatoriaGuardas :: Integer -> Integer -> Integer
sumatoriaGuardas x y
  | x > y  = sumatoriaGuardas y x
  | x == y  = x
  | otherwise = x + sumatoriaGuardas (x+1) y


-- Con if:
sumatoriaCondicional :: Integer -> Integer -> Integer
sumatoriaCondicional x y = 
   if x > y 
      then sumatoriaCondicional y x
      else x + sumatoriaCondicional (x+1) y

{-
b. Definir una funcion unirListas que permita concatenar 2 listas. Debe soportar esta operación diferentes tipos de datos. Hacer uso de la recursividad.
Ejemplo:
 - unirListas [1,2,3] [4,5,6] = [1,2,3,4,5,6]
 - unirListas ['h', 'o'] ['l', 'a'] = ['hola']
 - unirListas ["HOLA"] ["MUNDO"] = ["HOLA", "MUNDO"]
-}

unirListas :: [a] -> [a] -> [a]
unirListas [] ys = ys
unirListas (x : xs) ys = x  : unirListas xs ys

{-
c. Teniendo en cuenta la función map y su definición:
    map :: (a -> b) -> [b] -> [b]

Se pide definir las siguientes funciones lambda y aplicarlas a map:
  a) Multiplicar un elemento por 10.
  b) Elevar a la potencia 3 un elemento.
  c) Incrementar un elemento.
-}

-- a):
multiplicarPor10 :: [Integer] -> [Integer]
multiplicarPor10 lista = map (\x -> x * 10) lista

-- b):
elevarAlCubo :: [Integer] -> [Integer]
elevarAlCubo lista = map (\x -> x^3) lista

-- c):
incrementarUno :: [Integer] -> [Integer]
incrementarUno lista = map (\x -> x + 1) lista

{-
d. Haciendo uso de la recursividad, defina una función que recorra una cadena de caracteres y que retorne la cantidad de vocales encontradas. Para este caso, no utilice guardas.
-}

devolverVocales :: [Char] -> Integer
devolverVocales [] = 0
devolverVocales (x : xs) =
   if elem x "aeiouAEIO"
        then devolverVocales xs + 1 
        else devolverVocales xs

{-
e. Las dimensiones de los rectangulos se pueden representar por medio de pares de número, por ejemplo: 5,3 representa un triangulo de base 5 y altura 3. Se pide definir una funcion mayorRectangulo que reciba la representación de dos rectangulos y retorne el rectangulo de mayor área
-}

areaRectangulo :: (Integer, Integer) -> Integer
areaRectangulo (x, y) = x * y 

mayorRectangulo :: (Integer,Integer) -> (Integer, Integer) -> (Integer,Integer)
mayorRectangulo r1 r2
  | areaRectangulo r1 >= areaRectangulo r2 = r1
  | otherwise = r2

-- Parcial 3 - 2016:

{-
3) Empleando el lenguaje Haskell, defina una función recursiva que calcule el producto de los números que se encuentran en una lista. Ejemplo [1,3,5,6] el producto es 90.
-}

producto :: [Integer] -> Integer
producto [] = 1
producto (x : xs) = x * producto xs


{-
4) Definir la función en lenguaje Haskell esMultiploDe para determinar si dados dos números a y b, a es multiplo de b. La solución planteada debe estar implementada mediante el uso de guardas
-}

esMultiploDe :: Integer -> Integer -> Bool
esMultiploDe x y
  | (x `mod` y) == 0      = True
  | otherwise             = False

-- En una sola línea sin guardas: esMultiploDe x y = (x `mod` y) == 0

-- Parcial 3 - 2015
{-
a) Dado un número, que representa la cantidad de segundos, devuelva la cantidad de horas, minutos y segundos equivalentes.
Por ejemplo: 5000s = 1h:23m:20s
-}

hora :: Integer -> (Integer, Integer, Integer)
hora s = (s `div` 3600, (s `mod` 3600)`div`60, s `mod` 60)

{-
b) Concatenar dos listas. Debe soportar esta operación diferentes tipos de datos.
-}

concatenarListas :: [a] -> [a] -> [a]
concatenarListas [] ys = ys
concatenarListas (x : xs) ys = x : concatenarListas xs ys

{-
c) Haciendo uso de la recursividad, calcule el producto de los números que representan los extremos de un intervalo incluidos ellos. Por ejemplo daod el intervalo [1,4], su producto es: 1*2*3*4 = 24
-}

productoIntervalo2 :: Integer -> Integer -> Integer
productoIntervalo2 x y
  | x <= y     = x * productoIntervalo2 (x+1) y
  | otherwise  = 1


{-
d)  Definir un operador $& que determine si el cuadrado del primer argumento se aproxima al segundo elemento hasta en una diferencia de 0.0001.
NOTA: Considere que el operador tiene una prioridad = 5.
-}

infixl 5 $&

($&) :: Float -> Float -> Bool
($&) x y
  | abs (x*x - y) <= 0.0001 = True
  | otherwise             = False













