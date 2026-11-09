/*
2. Escriba un programa en donde se ejemplifique la forma de definir una excepción, como lanzarla y como capturarla. 
El objeto excepción deberá contener además un mensaje informativo del error, 
deberá proporcionar información adicional sobre la causa del error
*/

public class NotaInvalidaExcepcion extends Exception{
    
    private double notaErronea;
    
    public NotaInvalidaExcepcion(String mensaje , double notaErronea){
        
        super(mensaje);
        this.notaErronea = notaErronea;
        
    }
    
    pubic void getNotaErronea(){
        
        return notaErronea;
        
    }
    
}

pubic class SistemaAlumnos{
    
    public void cargarNota(double nota) throws NotaInvalidaExcepcion{
        
        if(nota < 0.00 || nota > 10.00) throw new NotaInvalidaExcepcion("ERROR: Las notas solo van del 0 al 10" , nota");
        
        System.out.println("Nota guardada: " + nota);
        
    }
    
}

public class Main{
    
    public static void main(String[] args){
        
        SistemaAlumnos sistema = new SistemaAlumnos();
        
        try{
            
            sistema.cargarNota(15);
            
        }
        catch(NotaInvalidaExcepcion e){
            
            System.out.println(e.getMessage()); 
            System.out.println("Causa: Usted intento cargar un " + e.getNotaErronea());
            
        }
        
    }
    
}