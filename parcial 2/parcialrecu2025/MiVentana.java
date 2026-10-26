/*
2. Se quiere administrar (altas y baja) datos de alumnos, que serán almacenados en un ArrayList mediante una aplicación Swing.
Los datos son: Matricula (numérico), Apellido y Nombre (Texto). Se pide:
    - Codificar el objeto escucha que se vinculará con el generador de eventos de los Botones "GUARDAR" y "BORAR" para realizar las respectivas acciones.   
    - Considere que en esta instancia, los datos del alumno están soportados en un objeto Alumno.
*/

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

class Alumno{
    
    int matricula;
    String apellido;
    String nombre;
    
    public Alumno(int matricula , String apellido , String nombre){
        
        this.matricula = matricula;
        this.apellido = apellido;
        this.nombre = nombre;
        
    }
    
}

public class MiVentana extends JFrame{
    
    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    
    private JTextField txtMatricula = new JTextField();
    private JTextField txtApellido = new JTextField();
    private JTextField txtNombre = new JTextField();
    private JButton btnGuardar = new JButton("GUARDAR"); 
    private JButton btnBorrar = new JButton("BORRAR"); 
    
    public MiVentana(){
        
        ManejadorEventos escucha = new ManejadorEventos();
        
        btnGuardar.addActionListener(escucha);
        btnBorrar.addActionListener(escucha);
        
    }

    private class ManejadorEventos implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            
            JButton boton = (JButton) e.getSource();
            String accion = boton.getText();
            
            if(accion.equals("GUARDAR")){
                
                int mat = Integer.parseInt(txtMatricula.getText());
                String ape = txtApellido.getText();
                String nom = txtNombre.getText();
                
                Alumno nuevo = new Alumno(mat , ape , nom);
                listaAlumnos.add(nuevo);
                
                System.out.println("Alumno guardado con exito");
                
            } 
            else if(accion.equals("BORRAR")){
                
                if(!listaAlumnos.isEmpty()){
                    
                    listaAlumnos.remove(listaAlumnos.size() - 1); 
                    System.out.println("Alumno borrado");
                
                }    
            
            }
            
        }
        
    }   
}