/*
Completá el método mostrarYContar que recibe un ArrayList<Integer> numeros.
Usando obligatoriamente un Iterator<Integer>, debe recorrer toda la lista, imprimir cada número por consola
y retornar la suma total de todos los elementos.
*/

import java.util.ArrayList;
import java.util.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ProcesadorLista{
    
    public int sumarElementos(ArrayList<Integer> numeros){
        
        int suma = 0;
        Iterator<Integer> iterador = numeros.iterator();

        while (iterador.hasNext()){
            
            Integer actual = iterador.next();
            System.out.println(actual);
            suma += actual;
            
        }

        return suma;
        
    }
    
}