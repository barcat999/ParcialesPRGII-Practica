/*
Desarrolle una aplicación Swing para gestionar la inscripción a un curso con cupo estrictamente limitado a 3 alumnos.

Se pide:
1. Crear una excepción personalizada llamada CupoLlenoException (hereda de Exception).
2. En la clase principal (VentanaInscripcion), declarar e instanciar un ArrayList<String> como atributo global para guardar los nombres.
3. La ventana debe contener: un JTextField (para el nombre), un botón "INSCRIBIR" y un botón "VER LISTA".
4. Utilizar una Clase Interna que implemente un único objeto escucha para ambos botones, diferenciándolos con e.getSource().
5. Lógica del botón INSCRIBIR:
    - Leer el nombre del campo de texto.
    - Si el ArrayList ya contiene 3 elementos, lanzar manualmente (throw) la CupoLlenoException.
    - Si hay lugar, guardar el nombre en la colección y vaciar el JTextField para el próximo ingreso.
    - Toda esta acción debe estar dentro de un try-catch que atrape tu excepción e imprima en consola: "Error: No hay más vacantes".
6. Lógica del botón VER LISTA:
    - Recorrer el ArrayList utilizando estrictamente un Iterator<String> e imprimir cada nombre por consola.
*/

import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.*;

class CupoLlenoException extends Exception{
    
    public CupoLlenoException(String mensaje){
        
        super(mensaje);
        
    }
    
}

public class VentanaInscripcion extends JFrame{
    
    private ArrayList<String> listaInscripciones = new ArrayList();
    private JTextField txtNombre = new JTextField(15);
    private JButton btnInscribir = new JButton("INSCRIBIR");
    private JButton btnVerLista = new JButton("VER LISTA");

    public VentanaInscripcion(){
        
        setLayout(new FlowLayout());
        add(txtNombre);
        add(btnInscribir);
        add(btnVerLista);
        
        ManejadorEventos escucha = new ManejadorEventos();
        
        btnInscribir.addActionListener(escucha);
        btnVerLista.addActionListener(escucha);
        
    }
    
    private class ManejadorEventos implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource() == btnInscribir){
                
                try{
                    
                    if(listaInscripciones.size() == 3){
                        
                        throw new CupoLlenoException("ERROR: No hay mas vacantes");
                        
                    }

                    String nombre = txtNombre.getText();
                    listaInscripciones.add(nombre);
                    System.out.println("Inscrito exitosamente: " + nombre);
                    
                    txtNombre.setText("");
                    
                }
                catch(CupoLlenoException ex){
                    
                    System.out.println(ex.getMessage());
                    
                }
                
                
            }
            else if(e.getSource() == btnVerLista){
                
                System.out.println("--- LISTA DE INSCRITOS ---");
                Iterator<String> it = listaInscripciones.iterator();
                
                while(it.hasNext()){
                    
                    System.out.println(it.next());
                    
                }
                
            }
            
        } 
        
    }
    
    public static void main (String[] args){
        
        VentanaInscripcion ventana = new VentanaInscripcion();
        ventana.setSize(300 , 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ventana.setVisible(true); 
        
    }
    
}