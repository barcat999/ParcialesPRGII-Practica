/*
12. Considerando la situación de un Jframe que contiene tres botones que realizan tareas diferentes; 
se pide codificar dos manejadores de eventos, uno haciendo uso de clase anónima, y el otro con la clase interna miembro.
*/

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class SegundoProblema extends JFrame{
    
    private JTextField txtCampo = new JTextField(15);
    private JButton btnGuardar = new JButton("Guardar");
    private JButton btnNuevo = new JButton("Nuevo");
    private JButton btnEditar = new JButton("Editar");
    
    public SegundoProblema(){
        
        setLayout(new FlowLayout());
        add(txtCampo);
        add(btnGuardar);
        add(btnNuevo);
        add(btnEditar);
        
        btnGuardar.addActionListener(new ActionListener(){      //      clase anonima
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
                txtCampo.setText("Accion: Guardar (Anonima)");
                
            }
            
        });
        
        ManejadorInterno escucha = new ManejadorInterno;        //      instanciacion y vinculacion clase interna miembro
        
        btnGuardar.addActionListener(escucha);
        btnNuevo.addActionListener(escucha);
        btnEditar.addActionListener(escucha);
        
    }
    
    private class ManejadorInterno implements ActionListener{       //      definicion clase interna miembro
        
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource() == btnNuevo){
                
                txtCampo.setText("Accion: Nuevo (Interna)");
                
            } 
            else if(e.getSource() == btnEditar){
                
                txtCampo.setText("Accion: Editar (Interna)");
                
            }
            
        }
        
    }
    
    public static void main(String[] args){
        
        VentanaEventosMixtos ventana = new VentanaEventosMixtos();
        ventana.setSize(300 , 150);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        
    }
    
}