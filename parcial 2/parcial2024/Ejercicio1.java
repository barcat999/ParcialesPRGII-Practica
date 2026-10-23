/*
1. Desarrolla un método que valide un número de teléfono. Si el número no tiene el formato correcto, 
lanza una excepción personalizada llamada NumeroTelefonoInvalidoException. La misma deberá contener, 
el número de teléfono ingresado erróneamente, el mensaje y un número de teléfono correcto a modo de ejemplo.

Consignas:
    a. Define la clase excepción NumeroTelefonoInvalidoException.
    b. Crear un método validarTelefono(String telefono) que lance la excepción si el formato no es válido. Par esto, considere el siguiente formato de numero de teléfono valido de un total debe tener 13 dígitos de longitud, comenzando con "549". (Ejemplo +54 9 38 3440 4734).
    c. Codifiquen un método donde deba validar números de teléfonos. 
    Maneje la excepción mostrando un mensaje al usuario con los valores proporcionado por la excepción.
*/

public class NumeroTelefonoInvalidoException extends Exception{
    
    private String telefonoErroneo;
    private String ejemploCorrecto;
    
    public NumeroTelefonoInvalidoException(String mensaje){
        
        super(mensaje);
        this.telefonoErroneo = telefonoErroneo;
        this.ejemploCorrecto = ejemploCorrecto;
        
    }
    
    public String obtenerDetalleError(){
        
        return super.getMessage() + "\nNumero ingresado: " + this.telefonoErroneo + "\nEjemplo valido: " + this.ejemploCorrecto;
    
    }
    
}

public class ValidarTelefono{
    
    public void validarTelefono(String telefono) throws NumeroTelefonoInvalidoException{
        
        if(telefono.length() != 13 || !telefono.startsWith("549")) throw new NumeroTelefonoInvalidoException("Error: El formato del numero telefonico es incorrecto" , telefono , "5493834404734");
        System.out.println("Telefono validado correctamente");
        
    }
    
}

public class Main{
    
    public static void main (String[] args){
        
        ValidarTelefono validador = new ValidarTelefono();
        
        try{        
            
            validador.validarTelefono("549123");
            
        }
        catch(NumeroTelefonoInvalidoException e){
            
            System.out.println(e.obtenerDetalleError());
            
        }
        
    }
    
}