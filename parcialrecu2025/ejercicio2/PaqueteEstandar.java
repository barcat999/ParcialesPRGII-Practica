package parcialrecu2025.ejercicio2;

public class PaqueteEstandar extends Paquete{

    public PaqueteEstandar(double peso , String destino , int dimension){

        super(peso, destino, dimension);

    }
    
    @Override 
    public double calcularCosto(){

        double costo = peso * 1500;

        return costo;
        
    }

}