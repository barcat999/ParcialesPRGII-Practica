/*EJEMPLO DE MUCHOS A MUCHOS (* a *)*/

public class Alumno{
    
    private Materia[] materiasInscriptas;       //      un alumno tiene MUCHAS materias
    
    public Alumno(){
        
        this.materiasInscriptas = new Materia[10];
    
    }

}

public class Materia{
    
    private Alumno[] alumnosAnotados; 
    
    public Materia(){
        
        this.alumnosAnotados = new Alumno[50];      //      una materia tiene MUCHOS alumnos
        
    }
    
}