package parcial2024.ejercicio6;

public class ArticulosUnidad extends Articulos{
    
    private String presentacion;

    public ArticulosUnidad(String marca , int codigo , Double precioUnitario , String presentacion){

        super(marca , codigo , precioUnitario);
        this.presentacion = presentacion;

    }

    @Override
    public double calcularPrecioFinal(){
    
        return precioUnitario * 1.21;
    
    }

}