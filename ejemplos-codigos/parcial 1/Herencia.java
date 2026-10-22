/*EJEMPLO DE HERENCIA*/

public class Vehiculo{
    
    private String modelo;
    private int año;
    private String patente;
    private int kilometros;
    
    public Vehiculo(String modelo , int año , String patente , int kilometros){
        
        this.modelo = modelo;
        this.año = año;
        this.patente = patente;
        this.kilometros = kilometros;
        
    }
    
    public void mostrarDatos(){
        
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Patente: " + patente);
        System.out.println("Kilómetros: " + kilometros);
        
    }
    
}

public class Automovil extends Vehiculo{
    
    public Automovil(String modelo , int año , String patente , int kilometros){
        
        super(modelo , año , patente , kilometros);
        
    }
    
}

public class Motocicleta extends Vehiculo{
    
    public Motocicleta(String modelo , int año , String patente , int kilometros){
        
        super(modelo , año , patente , kilometros);
        
    }
    
}