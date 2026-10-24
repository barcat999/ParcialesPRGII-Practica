/*
2. Realice una aplicación que empleando un JFrame permita realizar la suma de 2 números, 
ingresados mediante dos campos de texto respectivamente, que al presionar un botón calcular y muestre el resultado de la suma 
y también el cuadrado del resultado obtenido.
*/


import javax.swing.*;
import java.awt.event.*;

public class MiVentana extends JFrame{
    
    private JTextField campo1 = new JTextField();
    private JTextField campo2 = new JTextField();
    private JButton btnAccion = new JButton("Calcular");
    
    public MiVentana(){
        
        btnAccion.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e){
                
                int suma = Integer.parseInt(campo1.getText()) + Integer.parseInt(campo2.getText());
                
                System.out.println("Suma: " + suma);
                System.out.println("Cuadrado: " + (suma * suma));
                
            }
            
        }); 
        
    }
    
}