package parcialrecu2024.ejercicio1.composicion;

public class Libro{
    
    private String titulo;
    private Pagina numeroPagina;

    public Libro(String titulo){

        this.titulo = titulo;
        this.numeroPagina = new Pagina(1);

    }

}