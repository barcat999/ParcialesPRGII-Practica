/*
1. Escriba un programa en donde se ejemplifique la forma de:
    a. Definir una excepción.
    b. De lanzar una excepción.
    c. De capturar una excepción.
Nota: Debe indicar en el código donde se cumple cada inciso.
*/

public class MenorEdadException extends Exception{      //      inciso a
    
    public MenorEdadException(String mensaje){
        
        super(mensaje);
        
    }
    
}

public class ValidarEdad{
    
    public void validarEdad(int edad) throws MenorEdadException{        //      inciso b
        
        if(edad < 18) throw new MenorEdadException("ERROR: Es menor de edad");
        
        System.out.println("Edad valida");
        
    }
    
}

public class Main{
    
    public static void main (String[] args) {
        
        ValidarEdad validador = new ValidarEdad();
        
        try{        //      inciso c
            
            validador.validarEdad(16);
            
        }
        catch(MenorEdadException e){
            
            System.out.println(e.getMessage());
            
        }
        
    }
    
}