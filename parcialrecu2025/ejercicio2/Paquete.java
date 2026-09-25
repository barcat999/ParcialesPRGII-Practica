/*
2. Una empresa de mensajería desea calcular el costo de envío de distintos tipos de paquetes. 
Cada tipo de paquete determina su costo final a partir de sus propias reglas (por ejemplo: según peso, dimensiones, 
fragilidad, destino, etc.).
Se requiere desarrollar un sistema que permita registrar distintos paquetes, 
cada uno capaz de indicar cuál es su costo de envío. Además, se necesita un componente que, dado un conjunto de paquetes, 
calcule el costo total de enviarlos todos juntos, sin importar qué tipos específicos de paquetes componen la colección.
*/

package parcialrecu2025.ejercicio2;

public abstract class Paquete{

    protected double peso;
    protected String destino;
    protected int dimension;

    public Paquete(double peso , String destino , int dimension){

        this.peso = peso;
        this.destino = destino;
        this.dimension = dimension;

    }
    
    public abstract double calcularCosto();

}