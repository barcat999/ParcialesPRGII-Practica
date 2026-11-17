/*
Ejercicio 3 (Parcial 2 — Comparable en una clase)
Completá la clase Pelicula para que implemente Comparable<Pelicula>, definiendo como orden natural 
la duración en minutos de menor a mayor (usá Integer.compare(this.duracion, otra.duracion)):
*/

public class Pelicula /* 1. Implementar interfaz */ implements Comparable<Pelicula>{
    
    private String titulo;
    private int duracion;

    public Pelicula(String titulo , int duracion){
        
        this.titulo = titulo;
        this.duracion = duracion;
        
    }

    // 2. Método obligatorio de Comparable:
    @Override
    public int compareTo(Pelicula otra){
        
        return Integer.compare(this.duracion , otra.duracion));
        
    }
    
}