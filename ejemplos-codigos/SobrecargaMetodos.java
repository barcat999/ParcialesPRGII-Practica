/*SOBRECARGA DE CONSTRUCTORES*/

public class Producto{
    
    private int codigo;
    private String descripcion;
    private double precioUnitario;

    //      constructor 1: El completo (recibe 3 parámetros)
    public Producto(int codigo , String descripcion , double precioUnitario){
    
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    
    }

    //      constructor 2 (SOBRECARGADO): El rápido (recibe 1 solo parámetro)
    public Producto(int codigo){
        
        this.codigo = codigo;
        this.descripcion = "Descripción pendiente";
        this.precioUnitario = 0.0;
        
    }
    
}

/*----------------------------------------------------------------------------*/

/*SOBRECARGA DE METODOS*/

public class GestorDescuentos{

    //      metodo 1: aplica descuento por porcentaje
    public double calcular(double precioOriginal , double porcentajeDescuento){
        
        return precioOriginal - ((precioOriginal * porcentajeDescuento) / 100);
    
    }

    //      metodo 2 (SOBRECARGADO): aplica descuento restando plata fija
    public double calcular(double precioOriginal , int plataADescontar){
    
        return precioOriginal - plataADescontar;
    
    }

}