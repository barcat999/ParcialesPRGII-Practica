/*
11. Diseñe una clase EdadInvalidaException que extienda Exception. 
Luego, escriba una clase ValidarEdad con un método que reciba una edad como parámetro y lance excepción creada, 
si la edad es menor que 0 o mayor que 130. En el método main, se debe capturar esta excepción 
y mostrar un mensaje personalizado.
*/

public class EdadInvalidaException extends Exception{
    
    public EdadInvalidaException(String mensaje){
        
        super(mensaje);
        
    }
    
}

public class ValidarEdad{
    
    public void validarEdad(int edad) throws EdadInvalidaException{
        
        if(edad < 0 || edad > 130) throw new EdadInvalidaException("ERROR: Edad Invalida");
        
        System.out.println("Edad valida");
        
    }
    
} 

public static void main(String[] args){
    
    int edadPrueba = 150;
    
    try{
        
        ValidarEdad.validarEdad(edadPrueba);
        
    }
    catch(EdadInvalidaException e){
        
        System.out.println("Error de validacion: " + e.getMessage());
        
    }
    
}