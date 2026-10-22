package parcial2015.ejercicio1;

public class Automovil extends Alquiler{
    
    private int añoFabricacion;
    private int cantidadDiasAlquiler;
    
    public Automovil(int añoFabricacion , int cantidadDiasAlquiler){
        
        this.añoFabricacion = añoFabricacion;
        this.cantidadDiasAlquiler = cantidadDiasAlquiler;
        
    }

    @Override
    public double calcularPrecio(){
        
        double coeficienteAlquiler = 0.0;
        
        if(this.añoFabricacion >= 2006) coeficienteAlquiler = 80.00;
        else if(this.añoFabricacion <= 2006) coeficienteAlquiler = 55.00;
        
        double precio = coeficienteAlquiler * this.cantidadDiasAlquiler;
        return precio;
        
    }
    
}