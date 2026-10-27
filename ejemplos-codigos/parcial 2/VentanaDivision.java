/*
Ejercicio 2: Swing (Interfaz Gráfica + Manejo de Errores)

Desarrollá una aplicación visual llamada VentanaDivision:

1. Debe contener dos JTextField (para ingresar un dividendo y un divisor) y un JButton con el texto "DIVIDIR".
2. Utilizar un Layout y agregar todos los componentes para que sean visibles.
3. Usar una Clase Interna para implementar la escucha del botón.
4. Al presionar "DIVIDIR", leer ambos campos, convertirlos a enteros y realizar la división.
5. Todo el proceso debe estar en un bloque try-catch que atrape dos problemas específicos:
    - Que el usuario ingrese letras (capturar NumberFormatException).
    - Que el usuario intente dividir por cero (capturar ArithmeticException).
*/

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class VentanaDivision extends JFrame{
    
    private JTextField txtDividiendo = new JTextField(15);
    private JTextField txtDivisor = new JTextField(15);
    private JButton btnDividir = new JButton("DIVIDIR");
    
    public VentanaDivision(){
        
        setLayout(new FlowLayout());
        add(txtDividiendo);
        add(txtDivisor);
        add(btnDividir);
        
        ManejadorEventos escucha = new ManejadorEventos();
        
        btnDividir.addActionListener(escucha);
        
    }
    
    private class ManejadorEventos implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource() == btnDividir){
                
                try{
                    
                    int dividendo = Integer.parseInt(txtDividiendo.getText());
                    int divisor = Integer.parseInt(txtDivisor.getText());
                    
                    int resultado = dividendo / divisor;
                    
                    System.out.println("El resultado es: " + resultado);
                    
                }
                catch(NumberFormatException ex){
                    
                    System.out.println("ERROR: Ingrese solo numeros");
                    
                }
                catch(ArithmeticException ex){
                    
                    System.out.println("ERROR: Divisor mayor a 0");
                    
                }
                
            }
            
        }
        
    }
    
    public static void main(String[] args){
        
        VentanaDivision ventana = new VentanaDivision();
        ventana.setSize(300 , 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ventana.setVisible(true); 
        
    }
    
}