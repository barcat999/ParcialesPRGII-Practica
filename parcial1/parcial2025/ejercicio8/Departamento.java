package parcial2024.ejercicio8;

public class Departamento extends Alojamiento{
    
    public Departamento(String ubicacion , int capacidad , double precioNoche){

        super(ubicacion , capacidad , precioNoche);

    }

    @Override
    public String obtenerReglasCheckIn(){
        
        return "Retiro de llave con clave en caja de seguridad";
    
    }

}