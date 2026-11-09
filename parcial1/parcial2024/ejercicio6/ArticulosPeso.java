package parcial2024.ejercicio6;

public class ArticulosPeso extends Articulos implements Vendible{
    
    private double pesoReal; 
    private String material;

    public ArticulosPeso(String marca , int codigo , Double precioUnitario , double pesoReal , String material){

        super(marca , codigo , precioUnitario);
        this.pesoReal = pesoReal;
        this.material = material;

    }

    @Override
    public double calcularPrecioFinal(){

        double subtotal = super.getPrecioUnitario() * pesoReal;
        return subtotal * 1.10;

    }

}