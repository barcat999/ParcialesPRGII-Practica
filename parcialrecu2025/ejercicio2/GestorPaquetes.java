package parcialrecu2025.ejercicio2;

public class GestorPaquetes{

    public double calcularCostoTotal(Paquete[] arregloPaquetes){
        
        double total = 0; 
        
        // 2. Recorremos el arreglo de paquetes
        for(int i = 0; i < arregloPaquetes.length; i++){
            
            total = total + arregloPaquetes[i].calcularCosto();

        }
        
        return total; 

    }

}