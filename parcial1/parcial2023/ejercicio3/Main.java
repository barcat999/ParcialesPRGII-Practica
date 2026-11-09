/*MAIN USO EXCLUSIVO DE TESTEO*/

package parcial2023.ejercicio3;

public class Main{

    public static void main(String[] args){
        
        Calculadora miCalculadora = new Calculadora();
        
        int resultadoDosNumeros = miCalculadora.suma(10 , 5);
        System.out.println("La suma de dos es: " + resultadoDosNumeros);
        
        int resultadoTresNumeros = miCalculadora.suma(10 , 5 , 20);
        System.out.println("La suma de tres es: " + resultadoTresNumeros);
        
    }

}