package parcial2024.ejercicio4.composicion;

public class Casa{
    
    private String direccion;
    private Habitacion miHabitacion; 

    public Casa(String direccion){
        
        this.direccion = direccion;
        this.miHabitacion = new Habitacion("Dormitorio Principal");

    }

}