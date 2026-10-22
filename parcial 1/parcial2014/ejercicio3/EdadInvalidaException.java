package parcial2014.ejercicio3;

public class EdadInvalidaException extends Exception{
    
    public EdadInvalidaException(String mensaje){       //      constructor que recibe el texto del error
        
        super(mensaje);     //      se lo pasamos a la clase padre Exception
    
    }
    
}