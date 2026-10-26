/*
Ejercicio 1: Swing + Excepción Personalizada

Escribí una aplicación Swing completa en una clase llamada VentanaLogin que cumpla con los siguientes requisitos:

1. Definir una excepción personalizada PasswordCortaException que herede de Exception.
2. La ventana debe tener un JTextField para la contraseña y un JButton con el texto "INGRESAR".
3. Usar una Clase Interna para la escucha del botón.
    - Al hacer clic en "INGRESAR":
    - Si la clave ingresada tiene menos de 6 caracteres, lanzar manualmente (throw) PasswordCortaException.
4. Si tiene 6 o más caracteres, imprimir en consola: "Acceso concedido".
5. Envolver la validación en un bloque try-catch que capture PasswordCortaException e imprima su mensaje con ex.getMessage().

*/

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

class PasswordCortaException extends Exception{
    
    public PasswordCortaException(String mensaje){
        
        super(mensaje);
        
    }
    
}

class ValidarClave{
    
    public void validar(String clave) throws PasswordCortaException{
        
        if(clave.length() < 6) throw new PasswordCortaException("ERROR: Contraseña menor a 6 caracteres");
        System.out.println("Acceso concedido");
        
    }
    
}

public class VentanaLogin extends JFrame{
    
    private JTextField txtClave = new JTextField(15);
    private JButton btnIngresar = new JButton("INGRESAR");
    
    public VentanaLogin(){
        
        setLayout(new FlowLayout());
        add(txtClave);
        add(btnIngresar);
        
        ManejadorEventos escucha = new ManejadorEventos();
        
        btnIngresar.addActionListener(escucha);
        
    }
    
    private class ManejadorEventos implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource() == btnIngresar){
                
                ValidarClave validador = new ValidarClave();
                
                try{
                    
                    String caracteresIngresados = txtClave.getText();
                    validador.validar(caracteresIngresados);
                    
                }
                catch(PasswordCortaException ex){
                    
                    System.out.println(ex.getMessage());
                    
                }
                
            }
            
        }
        
    }
    
    public static void main(String[] args){
        
        VentanaLogin ventana = new VentanaLogin();
        ventana.setSize(300 , 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ventana.setVisible(true); 
        
    }
    
}