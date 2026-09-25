package parcialrecu2025.ejercicio2;

public class PaqueteFragil extends Paquete{

    private double recargo;

    public PaqueteFragil(double peso , String destino , int dimension , double recargo){

        super(peso, destino, dimension);
        this.recargo = recargo;

    }

    @Override 
    public double calcularCosto(){

        return (peso * 1500) + recargo;

    }

}