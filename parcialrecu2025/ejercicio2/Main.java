/*/IGNORAR , USO SOLAMENTE PARA TESTEO*/

package parcialrecu2025.ejercicio2;

public class Main{

    public static void main(String[] args) {

        PaqueteEstandar paquete1 = new PaqueteEstandar(2.5 , "Córdoba" , 30);
        PaqueteFragil paquete2 = new PaqueteFragil(1.5 , "Catamarca" , 20 , 3000);

        Paquete[] misEnvios = { paquete1, paquete2 };

        GestorPaquetes gestor = new GestorPaquetes();

        double costoFinal = gestor.calcularCostoTotal(misEnvios);

        System.out.println("El costo total de todos los envíos es: $" + costoFinal);

    }

}