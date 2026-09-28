package parcial2014.ejercicio2;

public class Combustible extends Producto{
    
    private String tipoCombustible;
    
    public Combustible(String marca , int codigo , double precioUnitario , String tipoCombustible){
        
        super(marca , codigo , precioUnitario);
        this.tipoCombustible = tipoCombustible;

    }
    
    @Override
    public double calcularPrecioVenta(int cantidadVendida){
        
        double subtotal = cantidadVendida * super.getPrecioUnitario(); 
        double impuesto = subtotal * 0.21;
        double precioVenta = subtotal + impuesto;
        
        return precioVenta;
        
    }
    
}