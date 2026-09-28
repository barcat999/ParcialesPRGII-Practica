package parcialrecu2024.ejercicio2;

public class AccesoriosPC extends Producto{

    private double porcentajeDescuento;
    private String equipoCorrespondiente;

    public AccesoriosPC(int codigo , String descripcion , double precioUnitario , double porcentajeDescuento , String equipoCorrespondiente){

        super(codigo , descripcion , precioUnitario);
        this.porcentajeDescuento = porcentajeDescuento;
        this.equipoCorrespondiente = equipoCorrespondiente;

    }

    @Override 
    public double precioVenta(){

        double valorDescuento = (super.getPrecioUnitario() * porcentajeDescuento) / 100;
        double precioVenta = super.getPrecioUnitario() - valorDescuento; 
        
        return precioVenta;

    }

}