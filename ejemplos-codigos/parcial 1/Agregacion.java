/*EJEMPLO DE AGREGACION*/

public class Monitor{
    
    private int pulgadas;
    
    public Monitor(int pulgadas){
        
        this.pulgadas = pulgadas;
        
    }
    
}

public class PC{
    
    private Monitor monitor;
    
    public PC(Monitor monitor){
        
        this.monitor = monitor;
        
    }
    
}