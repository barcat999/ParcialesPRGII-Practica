package parcial2024.ejercicio6;

public class ArticulosPeso extends Articulos{
    
    private double pesoReal; 
    private String material;

    public ArticulosPeso(String marca , int codigo , Double precioUnitario , double pesoReal , String material){

        super(marca , codigo , precioUnitario);
        this.pesoReal = pesoReal;
        this.material = material;

    }

    @Override
    public double calcularPrecioFinal(){

        double subtotal = precioUnitario * pesoReal;
        return subtotal * 1.10;

    }

}