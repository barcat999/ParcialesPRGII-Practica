package parcial2024.ejercicio6;

public class ArticulosUnidad extends Articulos implements Vendible{
    
    private String presentacion;

    public ArticulosUnidad(String marca , int codigo , Double precioUnitario , String presentacion){

        super(marca , codigo , precioUnitario);
        this.presentacion = presentacion;

    }

    @Override
    public double calcularPrecioFinal(){
    
        return super.getPrecioUnitario() * 1.21;
    
    }

}