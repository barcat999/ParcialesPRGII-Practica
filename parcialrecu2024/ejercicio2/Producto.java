package parcialrecu2024.ejercicio2;

public abstract class Producto{

    private int codigo;
    private String descripcion;
    private double precioUnitario;

    public Producto(int codigo , String descripcion , double precioUnitario){

        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;


    }

    /*trabajaremos con private y no  protected
    porlo tanto hacemos sus respectivos setters
    */

    public int getCodigo(){

        return codigo;

    }

    public String getDescripcion(){

        return descripcion;

    }

    public double getPrecioUnitario(){

        return precioUnitario;

    }
    
    public abstract double precioVenta();

}