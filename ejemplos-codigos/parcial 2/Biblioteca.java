/*
Ejercicio 2: Clase con ArrayList de objetos
Suponiendo que ya existe la clase Libro con el método public int getPaginas(), completá la clase Biblioteca:

    1. Atributo privado libros de tipo ArrayList<Libro>, inicializado en el constructor vacío.
    2. Método public void agregarLibro(Libro l) que lo guarde en la lista.
    3. Método public int contarTotalPaginas() que recorra la lista (con for-each o Iterator) y retorne la suma total de páginas.
*/

import java.util.ArrayList;

public class Biblioteca{
    
    // 1. Atributo privado:
    private ArrayList<Libro> libros;

    // 2. Constructor vacío:
    public Biblioteca(){
        
        this.libros = new ArrayList<>();
        
    }

    // 3. Método agregarLibro:
    public void agregarLibro(Libro l){
        
        this.libros.add(l);
        
    }

    // 4. Método contarTotalPaginas:
    public int contarTotalPaginas(){
        
        int total = 0;
        Iterator<Libro> it = this.libros.iterator();

        while(it.hasNext()){
            
            Libro actual = it.next();
            total += actual.getPaginas();
        
        }
        
        return total;
        
    }
    
}