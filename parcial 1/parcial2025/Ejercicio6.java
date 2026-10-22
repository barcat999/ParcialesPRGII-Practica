/*
6) Codifique un ejemplo sencillo que represente la Relación Agregación. Realice el diagrama UML
*/

package parcial2024;

public class Ejercicio6{

    public class Profesor{

        private String nombre;

        public Profesor(String nombre){

            this.nombre = nombre;

        }

    }

    public class Escuela{

        private Profesor profesor;

        public Escuela(Profesor profesor){

            this.profesor = profesor;

        }
    
    }
    
}