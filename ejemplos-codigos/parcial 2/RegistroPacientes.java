/*
Ejercicio 1: Lógica Pura (Excepciones + Colecciones)

Creá un programa de consola (sin interfaz gráfica) que cumpla los siguientes puntos:

    1. Crear una excepción personalizada llamada EdadInvalidaException (hereda de Exception).
    2. Crear una clase RegistroPacientes con un ArrayList<Integer> para guardar edades.
    3. Crear un método agregarEdad(int edad) que verifique: si la edad es menor a 0 o mayor a 120, 
    lance manualmente tu excepción. Si es válida, que la guarde en el ArrayList.
    4. Escribir un main donde se instancie la clase, se intente agregar la edad 150 dentro de un try-catch, 
    y se capture la excepción imprimiendo el mensaje de error.
*/

import java.util.ArrayList;

class EdadInvalidaException extends Exception{
    
    public EdadInvalidaException(String mensaje){
        
        super(mensaje);
        
    }
    
}

public class RegistroPacientes{
    
    private ArrayList<Integer> listaEdades = new ArrayList<>();
    
    public void agregarEdad(int edad) throws EdadInvalidaException{
        
        if(edad < 0 || edad > 120){
            
            throw new EdadInvalidaException("ERROR: Edad fuera del limite (0 - 120)");
            
        }
        else{
            
            listaEdades.add(edad);
            System.out.println("Edad valida y cargada al ArrayList");
            
        }
        
    }
    
    public static void main(String[] args){
        
        RegistroPacientes validador = new RegistroPacientes();
        
        try{
            
            validador.agregarEdad(200); 
            
        }
        catch(EdadInvalidaException e){
            
            System.out.println(e.getMessage());
            
        }
        
    }
    
}