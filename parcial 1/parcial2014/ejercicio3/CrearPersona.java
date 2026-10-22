package parcial2014.ejercicio3;

public class CrearPersona{

    public static void main(String[] args){
        
        System.out.println("--- Intentando crear Persona 1 ---");
        
        try{

            Persona p1 = new Persona("Said" , "Carlos" , 30123456 , 25 , 1.75);
            
            p1.mostrarDatos();
            System.out.println("¡Persona 1 creada con éxito!");
            
        }
        catch(EdadInvalidaException e){
            
            System.out.println("Atrapamos un error: " + e.getMessage());
        
        }

        System.out.println("\n--- Intentando crear Persona 2 ---");
        try{
            
            Persona p2 = new Persona("Quinteros" , "Oscar" , 40123456 , 150 , 1.65);
            p2.mostrarDatos(); 
            
        }
        catch (EdadInvalidaException e){
        
            System.out.println("Atrapamos un error: " + e.getMessage());
        
        }
        
    }
    
}