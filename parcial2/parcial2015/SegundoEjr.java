/*
2. Realice una aplicación que empleando un JFrame permita realizar la suma de 2 números, 
ingresados mediante dos campos de texto respectivamente, que al presionar un botón calcular y muestre el resultado de la suma 
y también el cuadrado del resultado obtenido.
*/

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class SegundoEjr extends JFrame{
    
    private JTextField txtCampoUno = new JTextField(15);
    private JTextField txtCampoDos = new JTextField(15);
    private JButton btnCalcular = new JButton("CALCULAR");
    
    public SegundoEjr(){
        
        setLayout(new FlowLayout());
        add(txtCampoUno);
        add(txtCampoDos);
        add(btnCalcular);

        btnCalcular.addActionListener(new MiEscuchador());
        
    }
    
    private class MiEscuchador implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            
            try{

                int num1 = Integer.parseInt(txtCampoUno.getText());
                int num2 = Integer.parseInt(txtCampoDos.getText());
                
                int suma = num1 + num2;
                int cuadrado = suma * suma;
                
                System.out.println("Resultado de la suma: " + suma);
                System.out.println("Cuadrado del resultado: " + cuadrado);

            } 
            catch(NumberFormatException ex){

                System.out.println("Por favor, ingrese solo numeros validos");

            }
            
        }
        
    }

    public static void main(String[] args){

        SegundoEjr ventana = new SegundoEjr();
        ventana.setSize(400 , 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ventana.setVisible(true); 
        
    }
    
}