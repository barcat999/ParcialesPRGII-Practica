package parcial2024.ejercicio5;

public abstract class Persona{

    protected String apellido;
    protected String nombre;
    protected int dni;

    public Persona(String apellido , String nombre , int dni){

        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;

    }

    public abstract void listar();

}