/*Main de testeo y prueba de dependencia*/

package parcialrecu2024.ejercicio1.dependencia;

public class Main{
    
    public static void main(String[] args) {

        Documento miDoc = new Documento("Respuestas del Recuperatorio: 10, 10, 10.");       //      alguien crea un documento que existe por su cuenta
        Impresora hp = new Impresora();     //      alguien crea una impresora que existe por su cuenta
        
        hp.imprimir(miDoc);     //      llamo al método de la impresora y le inyecto el documento en los paréntesis
        
    }

}