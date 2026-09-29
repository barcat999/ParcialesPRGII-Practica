package parcial2024.ejercicio5;

public abstract class Persona{

    private String apellido;
    private String nombre;
    private int dni;

    public Persona(String apellido , String nombre , int dni){

        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;

    }

    public String getApellido(){

        return apellido;

    }

    public String getNombre(){

        return nombre;

    }

    public int getDni(){

        return dni;

    }

    public abstract void listar();

}