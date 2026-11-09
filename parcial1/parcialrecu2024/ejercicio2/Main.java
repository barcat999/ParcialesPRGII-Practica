package parcialrecu2024.ejercicio2;

public class Main{

    public static void main(String[] args){
        
        Catalogo miCatalogo = new Catalogo();

        InsumosPC tinta = new InsumosPC(101 , "Cartucho Tinta Negra" , 15000.0 , "Impresora Epson");
        AccesoriosPC teclado = new AccesoriosPC(202 , "Teclado Mecanico RGB" , 50000.0 , 15.0 , "PC Escritorio");
        EquiposPC notebook = new EquiposPC(303 , "Notebook i7 16GB" , 850000.0 , "Computadora Portatil");

        System.out.println("--- INGRESANDO PRODUCTOS ---");
        miCatalogo.ingresarProducto(tinta);
        miCatalogo.ingresarProducto(teclado);
        miCatalogo.ingresarProducto(notebook);

        System.out.println("\n--- CATALOGO ORIGINAL ---");
        miCatalogo.listarProductos();

        System.out.println("\n--- ELIMINANDO PRODUCTO 202 ---");
        miCatalogo.sacarProducto(202);

        System.out.println("\n--- CATALOGO ACTUALIZADO ---");
        miCatalogo.listarProductos();

    }

}