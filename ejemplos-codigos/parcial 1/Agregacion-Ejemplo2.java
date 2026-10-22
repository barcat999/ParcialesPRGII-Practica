public class Estudiante{
    
    private String apellido;
    private String nombre;
    
    public Estudiante(String apellido, String nombre){
        
        this.nombre = nombre;     
        this.apellido = apellido;
        
    }
    
}

public class Universidad{
    
    private Estudiante miEstudiante; 
    
    public Universidad(Estudiante estudianteNuevo){
        
        this.miEstudiante = estudianteNuevo;
        
    }
    
}