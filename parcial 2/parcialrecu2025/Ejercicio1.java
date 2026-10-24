/*
1. Para ejemplificar el uso de excepción (como definirla, como lanzarla y como capturarla) considere la siguiente situación: 
"En un negocio de ventas de productos de limpieza se quiere implementar la modalidad de Ventas en Cta.Cte.. 
Para esto, el Cliente tendrá asignado un monto máximo permitido (MMP) y el monto para operar (MPO) en esta modalidad. 
Se deberá controlar al momento de confeccionar el pago, si el monto de la operación supera o no el MPO, 
en caso que supere se deberá lanzar una excepción con un mensaje indicando el saldo actual. 
En caso que no supere se deberá actualizar el MPO."
*/

public class VentaInvalidaException extends Exception{
    
    private double mmp;
    private double mpo;
    
    public VentaInvalidaException(String mensaje , double mmp , double mpo){
        
        super(mensaje);
        this.mmp = mmp;
        this.mpo = mpo;
        
    }
    
    public double getMmp(){
        
        return mmp;
        
    }
    
    public double getMpo(){
        
        return mpo;
        
    }
    
}

public class ValidarVentas{
    
    private double mmp = 10000.0;
    private double mpo = 1000.0;
    
    public void validarVentas(double monto) throws VentaInvalidaException{
        
        if(monto > mpo) throw new VentaInvalidaException("ERROR: El saldo supera al MPO: $" + mpo , mmp , mpo);
        
        mpo = mpo - monto;
        System.out.println("Pago con exito. MPO Actualizado: $" + mpo);
        
    }
    
}

public class Main{
    
    public static void main(String[] args){
        
        ValidarVentas venta = new ValidarVentas();
        
        try{
            
            venta.validarVentas(1500.0);
            
        }
        catch(VentaInvalidaException e){
            
            System.out.println(e.getMessage());
            
        }
        
    }
    
}