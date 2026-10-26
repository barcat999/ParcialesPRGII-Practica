/*
Simulacro Integrador: "Gestión de Inventario"
Se quiere administrar el inventario de un comercio mediante una aplicación Swing. Los datos a guardar son: 
    Código (entero) y Precio (decimal/double), los cuales deben estar soportados en un objeto Producto y almacenados en un ArrayList.
La ventana debe tener dos campos de texto y dos botones: "AGREGAR" y "TOTAL".

Se pide:

    1. Definir la clase Producto.
    2. Codificar la clase visual y el objeto escucha para los botones usando una Clase Interna.
    3. Al presionar "AGREGAR", se debe instanciar el producto con los datos de los campos de texto y guardarlo en la lista.
    4. Al presionar "TOTAL", se debe recorrer el ArrayList utilizando estrictamente un Iterator para sumar todos los precios e imprimir el monto total en la consola.
*/

import javax.swing.*;
import java.awt.event.*;
import java.util.*

class Producto{
    
    int codigo;
    double precio;
    
    public Producto(int codigo , double precio){
        
        this.codigo = codigo;
        this.precio = precio;
        
    }
    
}

public class MiVentana extends JFrame{
    
    private ArrayList<Producto> listaProductos = new ArrayList<>();
    
    private JTextField txtCodigo = new JTextField();
    private JTextField txtPrecio = new JTextField();
    private JButton btnAgregar = new JButton("AGREGAR");
    private JButton btnTotal = new JButton("TOTAL");
    
    public MiVentana(){
        
        ManejadorEventos escucha = new ManejadorEventos();
        
        btnAgregar.addActionListener(escucha);
        btnTotal.addActionListener(escucha);
        
    }
    
    private class ManejadorEventos implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            
            JButton btn = (JButton) e.getSource();
            String accion = btn.getText();
            
            
            if(accion.equals("AGREGAR")){
                
                int cod = Integer.parseInt(txtCodigo.getText());
                double pre = Double.parseDouble();
                
                Producto nuevo = new Producto(cod , pre);
                listaProductos.add(nuevo);
                
                System.out.println("Producto agregado exitosamente");
                
            }
            else if(accion.equals("TOTAL")){
                
                Iterator<Producto> iterador = listaProductos.iterator();
                
                while(iterador.hasNext()){
                    
                    Producto actual = iterador.next();
                    
                    sumaTotal = sumaTotal + actual.precio;
                    
                }
                
                System.out.println("El monto total del inventario es: $" + sumaTotal);
                
            }
            
        }
        
    }
    
}