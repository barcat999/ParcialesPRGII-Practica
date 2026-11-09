/*
1. Se necesita modelar un conjunto de figuras geométricas de distintos tipos, cada una capaz de calcular su propia área. 
Además, se requiere un componente que, dado un conjunto de figuras, sea capaz de devolver la sumatoria total de sus áreas. 
El sistema debe permitir incorporar diferentes tipos de figuras y procesarlas de manera uniforme a través del componente que 
calcula la suma total
*/

package parcialrecu2025.ejercicio1;

public interface FiguraGeometrica{

    double calcularArea();

}