package parcial2014.ejercicio3;

public class Persona{
 
    private String apellido;   
    private String nombre;
    private int dni;
    private int edad;
    private double altura;
    
    public Persona(String apellido , String nombre , int dni , int edad , double altura){
        
        if(edad < 0 || edad > 100) throw new EdadInvalidaException("Error: La edad " + edad + " no esta permitida");
        
        this.apellido = apellido;
        this. nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        
    }
    
    public void mostrarDatos(){
        
        System.out.println("Persona: " + nombre + " " + apellido + " | Edad: " + edad);
        
    }
    
}