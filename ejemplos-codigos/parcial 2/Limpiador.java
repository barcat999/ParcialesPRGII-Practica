/*
Ejercicio 1: Borrado seguro con Iterator (Clásico de parcial)
    Completá el método eliminarNegativos que recibe un ArrayList<Integer> lista y elimina de la lista todos
    los números menores a 0 usando obligatoriamente un Iterator<Integer>.
*/

import java.util.ArrayList;
import java.util.Iterator;

public class Limpiador{
    
    public void eliminarNegativos(ArrayList<Integer> lista){
        
        // Completá acá usando Iterator y it.remove():
        Iterator<Integer> iterador = lista.iterator();

        while(iterador.hasNext()){
            
            Integer actual = iterador.next();
            if(actual < 0){
                
                iterador.remove();
                
            }
            
        }
        
    }
    
}