/*
7) Codifique un ejemplo sencillo que represente la Relación Composición. Realice el diagrama UML 
*/

package parcial2024;

public class Ejercicio7{

    public class Pagina{

        private String numero;

        public Pagina(String numero){

            this.numero = numero;

        }

    }
    
    public class Libro{

        private Pagina pagina;

        public Libro(String numeroPagina){

            this.pagina = new Pagina(numeroPagina);

        }

    }
    
}