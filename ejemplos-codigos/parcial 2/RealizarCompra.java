public class MontoExcedidoException extends Exception{

    public MontoExcedidoException(String mensaje){
    
        super(mensaje);
    
    }
    
}

public class RealizarCompra{
    
    public void realizarCompra(double monto, double limite) throws MontoExcedidoException{
        
        if(monto > limite) throw new MontoExcedidoException("ERROR: El monto supera el límite!");
        System.out.println("Monto valido. Compra realizada con exito!");
        
    }
    
}

public class Main{
    
    public static void main(String[] args){
        
        RealizarCompra rc = new RealizarCompra(); 
        double montoPrueba = 1500;
        double limitePrueba = 1000;

        try{
            
            rc.realizarCompra(montoPrueba , limitePrueba);
            
        }catch (MontoExcedidoException e){
            
            System.out.println("Error a la hora de realizar la compra: " + e.getMessage());
            
        }
        
    }
    
}