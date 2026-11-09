/*
2. Considerando la situación de un Jframe que contiene cinco botones que realizan tareas diferentes. Se pide:
    a) Realizar el código que muestre esta situación y el manejo de los eventos que estos componentes pueden generar al momento de seleccionarlo.
    b) Hacer uso de un solo objeto escucha.
    c) Considere que al seleccionar un botón, se visualice en el TextField del Jframe el nombre del botón: "Guardar", "Nuevo", "Editar", para el caso "Cancelar" visualizar "========" y para el caso de "Borrar" limpiar el TextField.
    d) Indique en el código la creación del objeto escucha y la vinculación con el generador de eventos.
    e) Haga uso de Clases Interna en la gestión de los eventos.
*/

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class SegundoEjercicioVentana extends JFrame{
    
    private JTextField txtCampo = new JTextField(15);
    private JButton btnGuardar = new JButton("Guardar");
    private JButton btnNuevo = new JButton("Nuevo");
    private JButton btnEditar = new JButton("Editar");
    private JButton btnBorrar = new JButton("Borrar");
    private JButton btnCancelar = new JButton("Cancelar");
    
    public SegundoEjercicioVentana(){
        
        ManejadorEventos escucha = new ManejadorEventos();
        
        /*para botones , visual y todo eso*/
        setLayout(new FlowLayout());
        add(txtCampo);
        add(btnGuardar);
        add(btnNuevo);
        add(btnEditar);
        add(btnBorrar);
        add(btnCancelar);

        btnGuardar.addActionListener(escucha);
        btnNuevo.addActionListener(escucha);
        btnEditar.addActionListener(escucha);
        btnBorrar.addActionListener(escucha);
        btnCancelar.addActionListener(escucha);
        
    }
    
    private class ManejadorEventos implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            
            JButton botonPresionado = (JButton)e.getSource();
            String nombreBoton = botonPresionado.getText();
            
            if(e.getSource() == btnCancelar){

                txtCampo.setText("========"); 

            } 
            else if(e.getSource() == btnBorrar){

                txtCampo.setText(""); 

            } 
            else{
                
                txtCampo.setText(nombreBoton);

            }
            
        }
        
    }

    public static void main(String[] args){

        SegundoEjercicioVentana ventana = new SegundoEjercicioVentana();
        ventana.setSize(400 , 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ventana.setVisible(true); 

    }

}