package parcialrecu2024.ejercicio2;

public class Catalogo{
    
    private Producto[] productos;
    private int cantidadActual;

    public Catalogo(){

        this.productos = new Producto[50];
        this.cantidadActual = 0;

    }

    public void listarProductos(){

        for(int i = 0 ; i < cantidadActual ; i++){

            System.out.println("Producto: " + productos[i].getDescripcion() + "| Precio Final: $" + productos[i].precioVenta());

        }

    }

    public void ingresarProducto(Producto nuevoProducto){

        if(cantidadActual < 50){
        
            productos[cantidadActual] = nuevoProducto; 
            cantidadActual++; 

            System.out.println("Producto ingresado con exito");
        
        } 
        else System.out.println("ERROR: El catalogo esta lleno");

    }

    public void sacarProducto(int codigoBuscado){

        for(int i = 0 ; i < cantidadActual ; i++){
            
            if (productos[i].getCodigo() == codigoBuscado){
                
                for(int j = i ; j < cantidadActual - 1; j++){

                    productos[j] = productos[j + 1];

                }
                
                productos[cantidadActual - 1] = null;
                cantidadActual--; 
                
                System.out.println("Producto eliminado correctamente");
                return; 

            }

        }

        System.out.println("No se encontro ningun producto con ese codigo");

    }

}