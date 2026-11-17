/*
Código Corto (Evento de Botón en Swing)
Completá las 2 líneas marcadas en el constructor de VentanaContador para que cada vez que se haga clic en btnSumar, 
la variable contador aumente en 1 y se muestre en la etiqueta lblTexto:
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaContador extends JFrame{
    
    private JButton btnSumar;
    private JLabel lblTexto;
    private int contador = 0;

    public VentanaContador(){
        
        setLayout(new FlowLayout());
        btnSumar = new JButton("Sumar 1");
        lblTexto = new JLabel("0");

        // 1. Registrá un ActionListener anónimo en btnSumar:
        btnSumar.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                
                contador++;
                // 2. Actualizá el texto de lblTexto con el nuevo valor de contador:
                lblTexto.setText(String.valueOf(contador)); // O el atajo clásico concatenando con comillas vacías: lblTexto.setText("" + contador);

            }
            
        });

        add(btnSumar);
        add(lblTexto);
        setSize(250, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }

}