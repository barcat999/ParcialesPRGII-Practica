/*EJEMPLO DE DEPENDENCIA*/

public class Documento{
    
    private String nombre;
    
    public Documento(String nombre){
        
        this.nombre = nombre;
        
    }
    
}

public class Impresora{
    
    public void imprimir(Documento documento){
        
        System.out.println("Imprimiendo documento...");
        
    }
    
}