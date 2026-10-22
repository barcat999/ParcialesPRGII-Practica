package parcialrecu2024.ejercicio2;

public class EquiposPC extends Producto{

    private String tipoEquipo;

    public EquiposPC(int codigo , String descripcion , double precioUnitario , String tipoEquipo){

        super(codigo , descripcion , precioUnitario);
        this.tipoEquipo = tipoEquipo;

    }

    @Override 
    public double precioVenta(){

        return super.getPrecioUnitario();

    }

}