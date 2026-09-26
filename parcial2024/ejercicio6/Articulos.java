package parcial2024.ejercicio6;

/* */

public abstract class Articulos  /*implements Vendible*/{
    
    protected String marca;
    protected int codigo;
    protected Double precioUnitario;

    public Articulos(String marca , int codigo , Double precioUnitario){

        this.marca = marca;
        this.codigo = codigo;
        this.precioUnitario = precioUnitario;

    }

    public abstract double calcularPrecioFinal(); /*si se usa interface se eliminara esto e implementara la interfaz Vendible.java*/

}