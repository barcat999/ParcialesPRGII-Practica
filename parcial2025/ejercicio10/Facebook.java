package parcial2024.ejercicio10;

public class Facebook implements Autenticacion{
    
    @Override 
    public void iniciarSesion(){

        System.out.println("Iniciando sesion con Facebook...");

    }

    @Override 
    public void cerrarSesion(){

        System.out.println("Cerrando sesion de Facebook...");

    }

}