/*
10) Se está desarrollando una plataforma que permite autenticación mediante Google, Facebook, y Correo electrónico. Cada método de autenticación debe implementar iniciarSesion() y cerrarSesion().
a) ¿Qué mecanismo usarías para garantizar que todos los métodos de autenticación cumplan con los mismos requisitos?
b) Realice el código Java que represente el mecanismo que utilizarías. (no codifique los métodos getters y setters)
*/

package parcial2024.ejercicio10;

public interface Autenticacion{
    
    void iniciarSesion();
    void cerrarSesion();

}