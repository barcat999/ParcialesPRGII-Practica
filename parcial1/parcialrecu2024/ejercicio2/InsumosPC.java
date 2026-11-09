package parcialrecu2024.ejercicio2;

public class InsumosPC extends Producto{

    private String equipoDestino;

    public InsumosPC(int codigo , String descripcion , double precioUnitario , String equipoDestino){

        super(codigo , descripcion , precioUnitario);
        this.equipoDestino = equipoDestino;        

    }
    
    @Override 
    public double precioVenta(){

        return super.getPrecioUnitario();

    }

}