package parcial2024.ejercicio9;

public class MensajeInterno implements  Notificacion{

    @Override 
    public void enviar(){

        System.out.println("Enviado por Mensaje Interno");

    }

}