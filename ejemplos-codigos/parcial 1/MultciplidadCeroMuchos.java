/*EJEMPLO DE 0 A MUCHOS (0..*)*/

public class MultciplidadCeroMuchos{
    
    private Jugador[] jugadores;        //      multiplicidad *: usamos un arreglo para guardar varios objetos 
    private int cantidad;

    public MultciplidadCeroMuchos(int maxJugadores){
        
        this.jugadores = new Jugador[maxJugadores];     //      instanciamos el contenedor
        this.cantidad = 0;      //      arranca vacío (cero)

    }

    //      metodo para ir sumando partes hasta llegar a "muchos"
    public void agregarJugador(Jugador j){
        
        if(cantidad < jugadores.length){
            
            this.jugadores[cantidad] = j;
            this.cantidad++;
            
        }
        
    }
    
}