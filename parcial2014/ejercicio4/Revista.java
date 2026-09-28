package parcial2014.ejercicio4;

public class Revista extends Publicacion{
    
    private int numeroCorrelativo;
    
    public Revista(int codigo , String titulo , int añoPublicacion , int numeroCorrelativo){
        
        super(codigo , titulo , añoPublicacion);
        this.numeroCorrelativo = numeroCorrelativo;
        
    }
    
    @Override
    public String obtenerInformacion(){
        
        return "Revista [Codigo: " + super.getCodigo() + " | Titulo: " + super.getTitulo() + " | Año: " + super.getAñoPublicacion() + " | Nro Correlativo: " + this.numeroCorrelativo + "]";
        
    }
    
}