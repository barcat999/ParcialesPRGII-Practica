/*EJEMPLO DE MULTICIPLIDAD 1 (EXACTAMENTE 1)*/

public class MulticiplidadUno{
    
    private Motor motor;        //     multiplicidad 1: Obligatorio

    public MulticiplidadUno(Motor motor){       //      ell Auto no nace si no le pasamos un Motor ya creado
        
        this.motor = motor;
        
    }
    
}