package parcialrecu2024.ejercicio1.dependencia;

public class Impresora{
    
    public void imprimir(Documento doc){
        
        System.out.println("Iniciando impresión...");
        System.out.println(doc.getTexto());
        System.out.println("Impresión finalizada.");
        
    
    }

}