/*
Ejercicio 2 (Java — Parcial 2: Excepción Checked)
Creá una excepción personalizada Checked llamada NotaInvalidaException (con constructor que reciba un String mensaje) 
y escribí un método public void registrarNota(int nota) que la lance (throw) si nota < 0 || nota > 10.
*/

public class NotaInvalidaException extends Exception{
    
    public NotaInvalidaException(String mensaje){
        
        super(mensaje);
        
    } 
    
}

public class RegistrarNota{
    
    public void registrarNota(int nota) throws NotaInvalidaException{
        
        if(nota < 0 || nota > 10) throw new NotaInvalidaException("ERROR: Nota fuera del rango 0-10");        
        System.out.println("Nota registrada con exito");
        
    }
    
}

public class Main{
    
    public static void main (String[] args){
        
        RegistrarNota registro = new RegistrarNota();
        
        try{
            
            registro.registrarNota(15);
            
        }
        catch(NotaInvalidaException e){
            
            System.out.println(e.getMessage());

        }
        
    }
    
}