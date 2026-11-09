{-
6. Definan un tipo de dato Empleado con atributos como nombre y sueldo. 
Sobre ella se pide:
    a. Definir una función "sueldoMasBajo" para encontrar el sueldo más bajo 
    y otra "sueldoMasAlto" para encontrar el sueldo más alto dada una lista de empleados.
    b. Definir una función "filtrarSueldoMayorá" que filtre los sueldos mayores a un valor dado.
    c. Tomando la lista del punto anterior, definir una función "sueldoMasAltoFiltrado" 
    que retome al sueldo más alto.
Nota: Hacer uso de Funciones de orden superior, composición y recursión. 
Las definiciones de las funciones deben tener la parta declarativa.    
-}

data Empleado = Empleado{

    nombre :: String ,
    sueldo :: Float

}
-- a. 
sueldoMasBajo :: [Empleado] -> Float
sueldoMasBajo = minimum . map sueldo

sueldoMasAlto :: [Empleado] -> Float
sueldoMasAlto = maximum . map sueldo

-- b.
filtrarSueldoMayorA :: Float -> [Empleado] -> [Empleado]
filtrarSueldoMayorA valor = filter (\e -> sueldo e > valor)

-- c.
sueldoMasAltoFiltrado :: Float -> [Empleado] -> Float
sueldoMasAltoFiltrado valor = sueldoMasAlto . filtrarSueldoMayorA valor