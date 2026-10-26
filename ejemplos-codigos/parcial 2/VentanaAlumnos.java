/*
Ejercicio 2: Colecciones + Un solo Objeto Escucha

Creá una clase VentanaAlumnos que gestione un ArrayList<String> con nombres de alumnos:

1. La ventana debe tener dos botones: "AGREGAR" y "MOSTRAR", y un JTextField para escribir el nombre.
2. Usá un único objeto escucha (ManejadorEventos) para ambos botones usando e.getSource() == ....
3. Comportamiento:
    - Boton AGREGAR: Toma el texto del JTextField, lo suma al ArrayList e imprime por consola "Alumno cargado".
    - Boton MOSTRAR: Recorre el ArrayList utilizando un Iterator<String> e imprime todos los nombres guardados en la consola.
*/

import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.*;

public class VentanaAlumnos extends JFrame{
    
    private ArrayList<String> listaAlumnos = new ArrayList<>();
    
    private JTextField txtNombre = new JTextField(15);
    private JButton btnAgregar = new JButton("AGREGAR");
    private JButton btnMostrar = new JButton("MOSTRAR");
    
    public VentanaAlumnos(){
        
        setLayout(new FlowLayout());
        add(txtNombre);
        add(btnAgregar);
        add(btnMostrar);
        
        ManejadorEventos escucha = new ManejadorEventos();
        
        btnAgregar.addActionListener(escucha);
        btnMostrar.addActionListener(escucha);
        
    }
    
    private class ManejadorEventos implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource() == btnAgregar){
                
                String nombreIngresado = txtNombre.getText();
                listaAlumnos.add(nombreIngresado);
                System.out.println("Alumno cargado");
                
                txtNombre.setText("");
                
            }
            else if(e.getSource() == btnMostrar){
                
                System.out.println("--- Lista de Alumnos ---");
                
                Iterator<String> it = listaAlumnos.iterator();
                
                while (it.hasNext()){
                    
                    System.out.println(it.next());
                    
                }
                
            }
            
        }
        
    }
    
    public static void main(String[] args){
        
        VentanaAlumnos ventana = new VentanaAlumnos();
        ventana.setSize(300 , 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ventana.setVisible(true); 
        
    }
    
}