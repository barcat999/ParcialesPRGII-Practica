package parcialrecu2024.ejercicio1.herencia;

public class Auto extends Vehiculo{
    
    private int cv;

    public Auto(String marca , String modelo , int año , int kilometros , int cv){

        super(marca , modelo , año , kilometros);
        this.cv = cv;

    }

}