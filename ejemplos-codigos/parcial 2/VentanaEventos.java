/*
Simulacro Práctico: Gestión de Biblioteca

Considerando la situación de un JFrame para gestionar un catálogo, 
la ventana debe contener dos campos de texto (Código y Título) y tres botones que realizan tareas diferentes: 
"Registrar", "Limpiar" y "Cerrar".

Se pide:
    - Realizar el código que construya esta interfaz visual y maneje los eventos generados al seleccionar los botones.
    - Hacer uso de un solo objeto escucha para todos los componentes.
    - Programar la lógica condicional para que, al presionar "Registrar", el campo del título muestre la palabra "Guardado"; 
    al presionar "Limpiar", se vacíen ambos campos de texto; y al presionar "Cerrar", se imprima la palabra "Fin" en la consola.
    - Indicar obligatoriamente mediante comentarios en el código la creación del objeto escucha y la vinculación con el generador de eventos.
    - Hacer uso de Clases Interna en la gestión de los eventos.
*/

import javax.swing.*;
import java.awt.event.*;

public class MiVentana extends JFrame{
    
    private JTextField txtCodigo = new JTextField();
    private JTextField txtTitulo = new JTextField();
    private JButton btnRegistrar = new JButton("REGISTRAR");
    private JButton btnLimpiar = new JButton("LIMPIAR");
    private JButton btnCerrar = new JButton("CERRAR");
    
    public MiVentana(){
        
        ManejadorEventos escucha = new ManejadorEventos();
        
        btnRegistrar.addActionListener(escucha);
        btnLimpiar.addActionListener(escucha);
        btnCerrar.addActionListener(escucha);
        
    }
    
    private class ManejadorEventos implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            
            JButton boton = (JButton)e.getSource();
            String accion = boton.getText();
            
            if(accion.equals("REGISTRAR")){
                
                txtTitulo.setText("Guardado");
                
            } 
            else if(accion.equals("LIMPIAR")){
                
                txtCodigo.setText(""); 
                txtTitulo.setText("");
                
            } 
            else if(accion.equals("CERRAR")){
                
                System.out.println("Fin");
                
            }
            
        }
        
    }
    
}