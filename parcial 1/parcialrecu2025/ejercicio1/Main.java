/*IGNORAR MAIN , ES SOLO DE PRUEBA*/

package parcialrecu2025.ejercicio1;

public class Main{
    
    public static void main(String[] args){
        
        Circulo miCirculo = new Circulo(5);
        Rectangulo miRectangulo = new Rectangulo(10 , 2);

        FiguraGeometrica[] arreglo = {miCirculo , miRectangulo};

        GestorFiguras gestor = new GestorFiguras();
        double total = gestor.sumarAreas(arreglo);
        
        System.out.println("El área total es: " + total);

    }

}