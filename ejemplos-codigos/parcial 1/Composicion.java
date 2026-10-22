/*EJEMPLO DE COMPOSICION*/

public class Pagina{
    
    private int numero;
    
    public Pagina(int numero){
        
        this.numero = numero;
        
    }
    
}

public class Libro{
    
    private Pagina pagina;
    
    public Libro(int numeroPagina){
        
        this.pagina = new Pagina(numeroPagina);
        
    }
    
}