/*
4. Considerando la situación de un Jframe que contiene cinco botones que realizan tareas diferentes. Se pide:
    a) Realizar el código que muestre esta situación y el manejo de los eventos que estos componentes pueden generar.
    b) Se debe hacer uso de un solo objeto escucha.
    c) Considere que al seleccionar un botón, se visualice en el TextField del Jframe el nombre del botón ("Guardar", "Nuevo",...).
    d) Indique en el código la creación del objeto escucha y la vinculación con el generador de eventos.
    e) Haga uso de Clases Interna en la gestión de los eventos.
*/

import javax.swing.*;
import java.awt.event.*;

public class MiVentana extends JFrame{
    
    private JTextField campo = new JTextField();
    private JButton b1 = new JButton("Guardar");
    private JButton b2 = new JButton("Nuevo");
    private JButton b3 = new JButton("Editar");
    private JButton b4 = new JButton("Buscar");
    private JButton b5 = new JButton("Cancelar");
    
    public MiVentana(){
        
        ManejadorEventos escucha = new ManejadorEventos();
        
        b1.addActionListener(escucha);
        b2.addActionListener(escucha);
        b3.addActionListener(escucha);
        b4.addActionListener(escucha);
        b5.addActionListener(escucha);
        
    }
    
    private class ManejadorEventos implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            
            JButton botonPresionado = (JButton)e.getSource();
            campo.setText(botonPresionado.getText());
        
        }
        
    }
    
}