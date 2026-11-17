/*
Ejercicio 2 (Parcial 1 — Interfaces y Encapsulación)
Completá la clase Coche para que implemente la interfaz Encendible:

    1. Atributo privado encendido de tipo boolean (inicia en false).
    2. Implementá los dos métodos obligatorios de la interfaz cambiando el estado de encendido a true y false respectivamente.
*/

interface Encendible{

    void encender();
    void apagar();

}

class Coche /* 1. Implementar interfaz */ implements Encendible{
    
    // 2. Atributo privado:
    private boolean encendido;
    
    public Coche(boolean encendido){
        
        this.encendido = false;
        
    }

    // 3. Métodos de la interfaz:
    @Override
    public void encender(){
        
        this.encendido = true;
        
    }
    @Override 
    public void apagar(){
        
        this.encendido = false;   
        
    }
    
}