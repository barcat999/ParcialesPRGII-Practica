/*
4. Considerando la situación de un Jframe que contiene cinco botones que realizan tareas diferentes. Se pide:
    a) Realizar el código que muestre esta situación y el manejo de los eventos que estos componentes pueden generar.
    b) Se debe hacer uso de un solo objeto escucha.
    c) Considere que al seleccionar un botón, se visualice en el TextField del Jframe el nombre del botón ("Guardar", "Nuevo",...).
    d) Indique en el código la creación del objeto escucha y la vinculación con el generador de eventos.
    e) Haga uso de Clases Interna en la gestión de los eventos.
*/

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class CuartoEjercicio extends JFrame{
    
    private JTextField txtCampo = new JTextField(15);
    private JButton btnGuardar = new JButton("Guardar");
    private JButton btnNuevo = new JButton("Nuevo");
    private JButton btnEditar = new JButton("Editar");
    private JButton btnBuscar = new JButton("Buscar");
    private JButton btnCancelar = new JButton("Cancelar");
    
    public CuartoEjercicio(){
        
        setLayout(new FlowLayout());
        add(txtCampo);
        add(btnGuardar);
        add(btnNuevo);
        add(btnEditar);
        add(btnBuscar);
        add(btnCancelar);
        
        ManejadorEventos escucha = new ManejadorEventos();
        
        btnGuardar.addActionListener(escucha);
        btnNuevo.addActionListener(escucha);
        btnEditar.addActionListener(escucha);
        btnBuscar.addActionListener(escucha);
        btnCancelar.addActionListener(escucha);
        
    }
    
    private class ManejadorEventos implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            
            JButton botonPresionado = (JButton)e.getSource();
            txtCampo.setText(botonPresionado.getText());
        
        }
        
    }
    
    public static void main(String[] args){

        CuartoEjercicio ventana = new CuartoEjercicio();
        ventana.setSize(400 , 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ventana.setVisible(true); 
        
    }

}