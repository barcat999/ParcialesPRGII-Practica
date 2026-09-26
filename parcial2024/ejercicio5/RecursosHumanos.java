package parcial2024.ejercicio5;

import java.util.ArrayList;

public class RecursosHumanos{

    private ArrayList<Persona> listaPersonal;
    
    public RecursosHumanos(){

        this.listaPersonal = new ArrayList<>();
    
    }

    public void agregarPersonal(Persona p){

        listaPersonal.add(p);
    
    }

    public void listarTareasPersonal(){

        for (int i = 0; i < listaPersonal.size(); i++){
            
            listaPersonal.get(i).listar();

        }
        
    }

}