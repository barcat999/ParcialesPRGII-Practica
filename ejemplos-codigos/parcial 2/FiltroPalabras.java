/*
Ejercicio 1: Completar las 3 líneas del Iterator
    Completá los espacios marcados para recorrer palabras e imprimir solo las que tengan más de 4 letras:
*/

import java.util.ArrayList;
import java.util.Iterator;

public class FiltroPalabras{
    
    public void mostrarLargas(ArrayList<String> palabras){
        
        // 1. Creá el Iterator del mismo tipo que la lista:
        Iterator<String> it = palabras.iterator();

        // 2. Condición del while para saber si hay siguiente:
        while(it.hasNext()){

            // 3. Obtené el elemento actual y guardalo en una variable llamada "actual":
            String actual = it.next();

            if(actual.length() > 4){
                
                System.out.println(actual);
                
            }
            
        }
        
    }
    
}