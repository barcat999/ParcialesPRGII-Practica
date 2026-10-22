package parcial2023.ejercicio3;

/*
¿Se puede sobrecargar un constructor?: 
    Si, es la practica más común para dar distintas opciones al crear un objeto 
    La sobrecarga de metodos ocurre cuando definís dos o más metodos con el mismo nombre dentro de la misma clase, 
    pero que obligatoriamente reciben diferentes parámetros (distinta cantidad, distinto tipo o distinto orden) 
    Java decide cual ejecutar basandose en los datos que le pases al llamarlo
*/

public class Calculadora{
    
    //      no hay atributos ni constructor
    //      la clase solo ofrece los métodos sobrecargados

    public int suma(int a , int b){     //      metodo 1
        
        return a + b;
    
    }
    
    public int suma(int a , int b , int c){     //      metodo 2 (sobrecargado)
        
        return a + b + c;
    
        
    }

}