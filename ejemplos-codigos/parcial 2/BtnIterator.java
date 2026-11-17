/*
Ejercicio 3 (Java — Parcial 2: Swing + Iterator)
Completá el método actionPerformed(ActionEvent e) para que, si el evento proviene de btnListar, 
recorra un HashSet<String> materias usando un Iterator<String> e imprima cada materia por consola.
*/

@Override
public void actionPerformed(ActionEvent e){
    
    if(e.getSource() == btnListar){
        
        Iterator<String> it = materias.iterator();
    
        while (it.hasNext()){
            
            System.out.println(it.next());
        
        }
        
    }
    
}