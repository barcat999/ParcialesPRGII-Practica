/*
Ejercicio 1 (Java — Parcial 1: Herencia y Constructores)
Escribí la clase Dispositivo (con atributo private String marca y constructor con parámetro) y 
una subclase Celular que agregue private int bateria, llame correctamente al constructor padre con super(...) 
y tenga un getter getMarca().
*/

public class Dispositivo{
    
    private String marca;
    
    public Dispositivo(String marca){
        
        this.marca = marca;
        
    }
    
    public String getMarca(){
        
        return marca;
        
    }
    
}

public class  extends Dispositivo{
    
    private int bateria;
    
    public Celular(String marca , int bateria){
        
        super(marca);
        this.bateria = bateria;
        
    }
    
}