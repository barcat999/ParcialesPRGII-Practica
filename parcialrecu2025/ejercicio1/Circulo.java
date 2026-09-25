package parcialrecu2025.ejercicio1;

public class Circulo implements FiguraGeometrica{
    
    private int radio;

    public Circulo(int radio){

        this.radio = radio;

    }

    @Override 
    public double calcularArea(){
    
        return Math.PI * radio * radio;
    
    }

}