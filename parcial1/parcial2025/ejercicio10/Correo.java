package parcial2024.ejercicio10;

public class Correo implements Autenticacion{

    @Override 
    public void iniciarSesion(){

        System.out.println("Iniciando sesion con tu Correo...");

    }

    @Override 
    public void cerrarSesion(){

        System.out.println("Cerrando sesion de tu Correo...");

    }
    
}