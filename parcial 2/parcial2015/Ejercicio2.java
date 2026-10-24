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
        
        btnAccion.addMouseListener(new MiEscuchador());
        
    }
    
    private class MiEscuchador extends MouseAdapter{
        
        public void mouseClicked(MouseEvent e){
            
            @Override
            public void mouseClicked(MouseEvent e){
                
                try{
                    
                    int num1 = Integer.parseInt(campo1.getText());
                    int num2 = Integer.parseInt(campo2.getText());
                
                    int suma = num1 + num2;
                    int cuadrado = suma * suma;
                
                    System.out.println("Resultado de la suma: " + suma);
                    System.out.println("Cuadrado del resultado: " + cuadrado);
                    
                }
                catch(NumberFormatException ex){
                    
                    System.out.println("Por favor, ingrese solo números válidos.");
                    
                }
                
                
            }
            
            
        }
        
    }
    
}