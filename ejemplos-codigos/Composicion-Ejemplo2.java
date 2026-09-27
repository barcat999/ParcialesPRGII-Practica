public class Habitacion{
    
    private String pieza;
    
    public Habitacion(String pieza){
        
        this.pieza = pieza;
    
    }

}

public class Casa{
    
    private Habitacion miHabitacion; 
    
    public Casa(String nombrePieza){
        
        this.miHabitacion = new Habitacion(nombreDeLaPieza);
        
    }
    
}