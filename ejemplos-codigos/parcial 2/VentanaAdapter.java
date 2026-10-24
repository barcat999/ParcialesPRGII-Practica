import javax.swing.*;
import java.awt.event.*;

public class MiVentana extends JFrame{
    
    private JButton boton = new JButton("Click");
    
    public MiVentana(){
        
        ManejadorEventos escucha = new ManejadorEventos();
        
        boton.addMouseListener(escucha); 
        
    }
    
    private class ManejadorEventos extends MouseAdapter{
        
        
        @Override
        public void mouseClicked(MouseEvent e){
            
            JButton botonPresionado = (JButton)e.getSource();
            System.out.println("Se hizo clic con un Adapter");
            
        }
        
    }
    
}