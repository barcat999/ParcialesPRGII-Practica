package parcial2024.ejercicio8;

public class Hotel extends Alojamiento{

    public Hotel(String ubicacion , int capacidad , double precioNoche){

        super(ubicacion , capacidad , precioNoche);

    }

    @Override
    public String obtenerReglasCheckIn(){
    
        return "Recepcion disponible las 24 horas";
    
    }
    
}