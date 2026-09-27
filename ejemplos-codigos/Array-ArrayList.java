/*CODIGO CON ARRAY*/

public class CatalogoArray{
    
    //      1. ATRIBUTOS
    private Producto[] productos;
    private int cantidadActual;     //      para no perdernos

    public CatalogoArray(){     //      2. CONSTRUCTOR
        
        this.productos = new Producto[50];      //      limite rigido
        this.cantidadActual = 0;
    
    }

    public void ingresarProducto(Producto p){       //      3. INGRESAR
        
        if(cantidadActual < 50){        //     hay que controlar que no explote
          
            productos[cantidadActual] = p;      //      guardamos con corchetes
            cantidadActual+;        //      sumamos a mano
            
        }
        
    }

    public void listarProductos(){      //      4. LISTAR
        
        for(int i = 0; i < cantidadActual; i++){        //      usamos nuestra variable

            System.out.println(productos[i].getDescripcion());      //      sacamos el producto usando corchetes: [i]

        }

    }

}

/*--------------------------------------------------------------------------------------------------------------------------*/

/*CODIGO CON ARRAYLIST*/

import java.util.ArrayList;     //      hay que importarlo arriba de todo

public class Catalogo{
    
    private ArrayList<Producto> productos;      //      1. el atributo: ya no hay corchetes [] , usamos los picos <>
    
    public Catalogo(){
        
        this.productos = new ArrayList<>();     //      2. el constructor: Nace la lista vacia , sin tamaño fijo 
    
    }

    
    public void ingresarProducto(Producto p) {      //      3. INGRESAR
        
        productos.add(p);       //      no hay "if" , no hay contadores. lo empuja al final y se estira solo
        
    }

    public void listarProductos(){      //      4. LISTAR
        
        for(int i = 0; i < productos.size(); i++){      //       le preguntamos su tamaño real con .size()
            
            System.out.println(productos.get(i).getDescripcion());      //      sacamos el producto usando el método: .get(i) 
        
        }
        
    }
    
}