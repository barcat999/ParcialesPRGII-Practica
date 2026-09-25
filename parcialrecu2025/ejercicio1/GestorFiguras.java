package parcialrecu2025.ejercicio1;

public class GestorFiguras{

    public double sumarAreas(FiguraGeometrica[] arregloFiguras){
        
        double total = 0; 

        for(int i = 0 ; i < arregloFiguras.length ; i++){
            
            total = total + arregloFiguras[i].calcularArea(); 
        
        }

        return total; 

    }

}