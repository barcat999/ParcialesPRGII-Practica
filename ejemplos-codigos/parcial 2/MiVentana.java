/*
Simulacro Integrador: "Control de Stock" CON ADAPTER

Se requiere una aplicación Swing para procesar la venta de un producto que tiene un stock fijo de 50 unidades. 
La ventana debe contener un campo de texto para ingresar la cantidad a comprar y un botón "VENDER".
Se pide:

    1. Definir una clase de excepción personalizada llamada StockExcedidoException que herede de Exception.   
    2. Codificar la clase visual principal y el objeto escucha usando una Clase Interna.   
    3. Al presionar el botón "VENDER", se debe leer la cantidad ingresada. 
        Si esa cantidad es mayor a 50, se debe lanzar manualmente (throw) tu excepción personalizada. Si es igual o menor, imprimir "Venta exitosa".   
    4. Envolver la lógica de lectura y validación del botón en un bloque try-catch que capture tu StockExcedidoException (imprimiendo "Error: No hay stock suficiente") 
        y que también capture la clásica NumberFormatException (imprimiendo "Error: Ingrese solo números").
*/

import java.awt.event.*;
import javax.swing.*;

/*public*/ class StockExcedidoException extends Exception{
    
    public StockExcedidoException(String mensaje){
        
        super(mensaje);
        
    }
    
}

/*public*/ class ValidarStock{
    
    public void validarStock(int cantidad) throws StockExcedidoException{
        
        if(cantidad > 50) throw new StockExcedidoException("ERROR: La cantidad supera al stock");
        System.out.println("Venta exitosa");
        
    }
    
}

public class MiVentana extends JFrame{
    
    private JTextField txtCampo = new JTextField("Ingrese cantidad aquí...");
    private JButton btnVender = new JButton("VENDER");
    
    public MiVentana(){
        
        ManejadorEventos escucha = new ManejadorEventos();
        
        btnVender.addActionListener(escucha);

        txtCampo.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e){
                
                txtCampo.setText("");       //      ALl hacer clic , limpiamos el texto de ayuda

            }

        });
        
    }
    
    private class ManejadorEventos implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            
            //JButton btn = (JButton)e.getSource();
            //String accion = btn.getText();
            
            if(e.getSource() == btnVender){
                
                ValidarStock producto = new ValidarStock();
                
                try{
                    
                    int cantidadIngresada = Integer.parseInt(txtCampo.getText());
                    producto.validarStock(cantidadIngresada);
                    
                }
                catch(StockExcedidoException ex){
                    
                    System.out.println(ex.getMessage());
                    
                }
                catch(NumberFormatException ex){
                    
                    System.out.println("ERROR: Ingrese solo numeros");
                    
                }
                
            }
            
        }
        
    }

    public static void main(String[] args){

        MiVentana ventana = new MiVentana();
        ventana.setSize(300 , 200);      //      define el ancho y alto en píxeles
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ventana.setVisible(true); 
    
    }
    
}