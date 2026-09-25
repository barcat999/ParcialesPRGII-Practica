package parcial2024.ejercicio10;

public class Google implements Autenticacion{
    
    @Override 
    public void iniciarSesion(){

        System.out.println("Iniciando sesion con Google...");

    }

    @Override 
    public void cerrarSesion(){

        System.out.println("Cerrando sesion de Google...");

    }

}