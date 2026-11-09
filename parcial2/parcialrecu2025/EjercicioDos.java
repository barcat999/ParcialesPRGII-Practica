/*
2. Se quiere administrar (altas y baja) datos de alumnos, que serán almacenados en un ArrayList mediante una aplicación Swing.
Los datos son: Matricula (numérico), Apellido y Nombre (Texto). Se pide:
    - Codificar el objeto escucha que se vinculará con el generador de eventos de los Botones "GUARDAR" y "BORAR" para realizar las respectivas acciones.   
    - Considere que en esta instancia, los datos del alumno están soportados en un objeto Alumno.
*/

import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

class Alumno{
    
    int matricula;
    String apellido;
    String nombre;
    
    public Alumno(int matricula , String apellido , String nombre){
        
        this.matricula = matricula;
        this.apellido = apellido;
        this.nombre = nombre;
        
    }

    public int getMatricula(){return matricula;}
    public String getApellido(){return apellido;}
    public String getNombre(){return nombre;}
    
}

public class EjercicioDos extends JFrame{
    
    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    
    private JTextField txtMatricula = new JTextField(15);
    private JTextField txtApellido = new JTextField(15);
    private JTextField txtNombre = new JTextField(15);
    private JButton btnGuardar = new JButton("GUARDAR"); 
    private JButton btnBorrar = new JButton("BORRAR"); 
    
    public EjercicioDos(){
        
        ManejadorEventos escucha = new ManejadorEventos();
        
        /*para botones , visual y todo eso*/
        setLayout(new FlowLayout());
        add(txtMatricula);
        add(txtApellido);
        add(txtNombre);
        add(btnGuardar);
        add(btnBorrar);
        
        btnGuardar.addActionListener(escucha);
        btnBorrar.addActionListener(escucha);
        
    }

    private class ManejadorEventos implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource() == btnGuardar){
                
                int mat = Integer.parseInt(txtMatricula.getText());
                String ape = txtApellido.getText();
                String nom = txtNombre.getText();
                
                Alumno nuevo = new Alumno(mat , ape , nom);
                listaAlumnos.add(nuevo);
                
                System.out.println("Alumno guardado con exito");
                
            } 
            else if(e.getSource() == btnBorrar){
                
                if(!listaAlumnos.isEmpty()){
                    
                    listaAlumnos.remove(listaAlumnos.size() - 1); 
                    System.out.println("Alumno borrado");
                
                }    
            
            }
            
        }
        
    }   

    public static void main(String[] args){

        EjercicioDos ventana = new EjercicioDos();
        ventana.setSize(400 , 200);      //      define el ancho y alto en píxeles
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ventana.setVisible(true); 
    
    }

}