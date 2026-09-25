package parcialrecu2025.ejercicio1;

public class Rectangulo implements FiguraGeometrica{

    private int base;
    private int altura;

    public Rectangulo(int base , int altura){

        this.base = base;
        this.altura = altura;
    
    }

    @Override 
    public double calcularArea(){

        return base * altura;

    }
    
}