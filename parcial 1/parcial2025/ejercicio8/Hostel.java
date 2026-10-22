package parcial2024.ejercicio8;

public class Hostel extends Alojamiento{

    public Hostel(String ubicacion , int capacidad , double precioNoche){

        super(ubicacion , capacidad , precioNoche);

    }
    
    @Override
    public String obtenerReglasCheckIn(){

        return "Horario estricto de 12:00 a 20:00 hs";

    }

}