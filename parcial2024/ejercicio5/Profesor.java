package parcial2024.ejercicio5;

public class Profesor extends Persona{
    
    private String especialidad;
    private String facultad;
    private String titulacion;

    public Profesor(String apellido , String nombre , int dni , String especialidad , String facultad , String titulacion){

        super(apellido , nombre , dni);
        this.especialidad = especialidad;
        this.facultad = facultad;
        this.titulacion = titulacion;

    }

    @Override 
    public void listar(){

        System.out.println("Apellido: " + apellido + "Nombre: " + nombre + "DNI: " + dni + "Especialidad: " + especialidad + "Facultad: " + facultad + "Titulacion: " + titulacion);

    }

}