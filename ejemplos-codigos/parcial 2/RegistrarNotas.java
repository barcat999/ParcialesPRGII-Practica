/*
Ejercicio 2: Clase Gestora con ArrayList (Estilo Parcial 2025)

Escribí una clase llamada RegistroNotas que tenga:
    1. Un atributo privado notas de tipo ArrayList<Double>, inicializado en el constructor vacío (this.notas = new ArrayList<>();).
    2. Un método public void agregarNota(double nota) que agregue la nota a la lista.
    3. Un método public double calcularPromedio() que recorra la lista (con for-each o Iterator) 
    y devuelva el promedio de las notas cargadas (si la lista está vacía, que devuelva 0.0 para evitar dividir por cero).
*/


import java.util.ArrayList;

public class RegistroNotas{
    
    private ArrayList<Double> notas;

    public RegistroNotas(){
        
        this.notas = new ArrayList<>();
        
    }

    public void agregarNota(double nota){
        
        this.notas.add(nota);
        
    }

    public double calcularPromedio(){
        
        if(this.notas.isEmpty()){
            
            return 0.0;
            
        }

        double suma = 0.0;
        for(Double actual : this.notas){
            
            suma += actual;
            
        }
        
        /*Con Iterator:
        Iterator<Double> it = this.notas.iterator();

        while (it.hasNext()){
        
            Double actual = it.next();
            suma += actual;
            
        }
        */

        return suma / this.notas.size();
        
    }
    
}