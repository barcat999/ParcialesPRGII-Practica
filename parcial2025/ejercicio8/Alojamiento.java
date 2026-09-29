/*
8) En una plataforma de turismo, se necesita representar distintos tipos de alojamiento: Hotel, Hostel, Departamento. 
Todos comparten atributos como ubicación, capacidad, y precio por noche, pero tienen comportamientos particulares.   
    a) ¿Qué estrategia usarías para organizar las clases de forma jerárquica y reutilizable?   
    b) Realice el código Java que represente su estrategia. (no codifique los métodos getters y setters)  
*/

package parcial2024.ejercicio8;

public abstract class Alojamiento{
    
    private String ubicacion;
    private int capacidad;
    private double precioNoche;

    public Alojamiento(String ubicacion , int capacidad , double precioNoche){

        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.precioNoche = precioNoche;

    }

    /*
    pide no codificar los getters y setters pero lo hago de igual manera 
    solamente para resspetar los principíos de POO y no usar protected
    */

    public String getUbicacion(){

        return ubicacion;

    }

    public int getCapacidad(){

        return capacidad;

    }

    public double getPrecioNoche(){

        return precioNoche;

    }

}