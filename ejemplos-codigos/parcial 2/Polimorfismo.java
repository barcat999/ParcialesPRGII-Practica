abstract class Transporte{      //      1. Superclase abstracta (Clase Madre)
    
    public abstract void moverse();
    
}

/*2. Subclases concretas (Clases Hijas)*/
class Auto extends Transporte{
    
    @Override
    public void moverse(){
        
        System.out.println("El auto avanza por la ruta");
        
    }
    
}

class Avion extends Transporte{
    
    @Override
    public void moverse(){
        
        System.out.println("El avion vuela por el cielo");
        
    }
    
}

public class PruebaPolimorfismo{        //      3. Prueba Practica
    
    public static void main(String[] args){
        
        Transporte miVehiculo;      //      Variable polimórfica (Tipo Estático: Transporte)
        
        /*Asignacion polimórfica (Tipo Dinamico: Auto)*/
        miVehiculo = new Auto();
        miVehiculo.moverse();
        
        /*Reasignacion al mismo tipo estatico , pero distinto tipo dinamico*/
        miVehiculo = new Avion();
        miVehiculo.moverse();
        
    }
    
}