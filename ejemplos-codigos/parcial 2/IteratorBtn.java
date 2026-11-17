/*
Ejercicio 4 (Parcial 2 — Iterator + ActionListener combinado)
Completá el método actionPerformed para que, al hacer clic en btnMostrar, recorra la lista nombres 
usando Iterator<String> e imprima cada nombre en consola:
*/

// Suponiendo que existen los atributos: private JButton btnMostrar; y private List<String> nombres;
@Override
public void actionPerformed(ActionEvent e){
    
    if(e.getSource() == btnMostrar){
        
        // COMPLETAR RECORRIDO CON ITERATOR AQUÍ
        Iterator<String> it = nombres.iterator();
        while(it.hasNext()){
        
            System.out.println(it.next());
        
        }
        
    }
    
}