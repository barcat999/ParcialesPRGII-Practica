package parcial2024.ejercicio6;

/* */

public abstract class Articulos{
    
    protected String marca;
    protected int codigo;
    protected double precioUnitario;

    public Articulos(String marca , int codigo , double precioUnitario){

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