package parcial2014.ejercicio4;

public class Libro extends Publicacion implements Prestable{
    
    private boolean estadoPrestado;
    
    public Libro(int codigo , String titulo , int añoPublicacion , boolean estadoPrestado){
        
        super(codigo , titulo , añoPublicacion);
        this.estadoPrestado = false;
        
    }
    
    @Override
    public String obtenerInformacion(){
        
        return "Libro [Codigo: " + super.getCodigo() + " | Titulo: " + super.getTitulo() + " | Año: " + super.getAñoPublicacion() + "]";
        
    }
    
    @Override
    public void prestar(){
        
        this.estadoPrestado = true;     //      cambiamos el estado a prestado
    
    }
    
    @Override
    public void devolver(){
    
        this.estadoPrestado = false;        //      cambiamos el estado a devuelto
    
    }
    
    @Override
    public boolean prestado(){
        
        return this.estadoPrestado;     //      avisamos como está el interruptor

    }
    
}