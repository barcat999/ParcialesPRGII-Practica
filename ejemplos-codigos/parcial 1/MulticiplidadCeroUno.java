/*EJEMPLO DE CERO A UNO (0..1)*/

public class MulticiplidadCeroUno{
    
    private Cochera cocheraAsignada;        //      multiplicidad 0..1: puede tener una cochera o valer null 

    public MulticiplidadCeroUno(){
        
        this.cocheraAsignada = null;        //      arranca en 0 (sin cochera)
        
    }

    public void asignarCochera(Cochera c){
        
        this.cocheraAsignada = c;       //      si algun día le dan cochera , pasamos a 1
        
    }
    
}