/*
9) Se tiene que crear un sistema de notificaciones para una plataforma educativa. 
Las notificaciones pueden enviarse por correo electrónico, SMS o mensaje interno. 
Todas deben tener un método enviar(), pero cada una lo implementa de forma distinta.   
    a) ¿Cómo diseñarías las clases para que el sistema pueda manejar cualquier tipo de notificación sin saber su tipo 
    específico? ¿Qué concepto aplicarías?   
    b) Realice el código Java que represente su respuesta. (no codifique los métodos getters y setters)  
*/

package parcial2024.ejercicio9;

public interface  Notificacion{
    
    void enviar();

}