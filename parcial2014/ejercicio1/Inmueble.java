package parcial2015.ejercicio1;

public class Inmueble extends Alquiler{
    
    private int cantidadHabitaciones;
    private double zona;
    private double superficie;
    
    public Inmueble(int cantidadHabitaciones , double coeficienteZona , double superficie){
        
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.zona = zona;
        this.superficie = superficie;
        
    }
    
    @Override
    public double calcularPrecio(){
        
        double coeficienteZona = 0.0;
        
        if(this.zona == 1) coeficienteZona = 1.50;
        else if(this.zona == 2) coeficienteZona = 1.25;
        
        double precio = this.cantidadHabitaciones * coeficienteZona * this.superficie;
        
        return precio;
        
    }
    
}