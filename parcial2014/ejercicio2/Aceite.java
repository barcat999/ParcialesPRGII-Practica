package parcial2014.ejercicio2;

public class Aceite extends Producto{
    
    private String presentacion;
    
    public Aceite(String marca , int codigo , double precioUnitario , String presentacion){
        
        super(marca , codigo , precioUnitario);
        this.presentacion = presentacion;
        
    }
    
    @Override
    public double calcularPrecioVenta(int cantidadVendida){
        
        double subtotal = cantidadVendida * super.getPrecioUnitario(); 
        double impuesto = subtotal * 0.1;
        double precioVenta = subtotal + impuesto;
        
        return precioVenta;
        
    }
    
}