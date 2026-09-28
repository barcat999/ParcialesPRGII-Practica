package parcial2014.ejercicio2;

public abstract class Producto implements PrecioVenta{
    
    private String marca;
    private int codigo;
    private double precioUnitario;
    
    public Producto(String marca , int codigo , double precioUnitario){
        
        this.marca = marca;
        this.codigo = codigo;
        this.precioUnitario = precioUnitario;
        
    }
    
    public String getMarca(){
        
        return marca;
        
    }
    
    public int getCodigo(){
        
        return codigo;
        
    }
    
    public double getPrecioUnitario(){
        
        return precioUnitario;
        
    }
    
}