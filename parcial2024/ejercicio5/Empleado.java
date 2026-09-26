package parcial2024.ejercicio5;

public class Empleado extends Persona{
    
    private String cargo;
    private String departamento;

    public Empleado(String apellido , String nombre , int dni , String cargo , String departamento){

        super(apellido , nombre , dni);
        this.cargo = cargo;
        this.departamento = departamento;

    }

    @Override 
    public void listar(){

        System.out.println("Apellido: " + apellido + "Nombre: " + nombre + "DNI: " + dni + "Cargo: " + cargo + "Departamento: " + departamento);

    }

}
