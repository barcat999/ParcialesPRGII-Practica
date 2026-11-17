/*
9. Completá el actionPerformed para que, si se presionó botonAceptar, imprima "Aceptado", y si se presionó botonCancelar, imprima "Cancelado":
*/

private class OyenteOpciones implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        
        // COMPLETAR AQUÍ
        if(e.getSource()== botonAceptar){
            
            System.out.println("Aceptado");
            
        }
        else if(e.getSource() == botonCancelar){
            
            System.out.println("Cancelado");
            
        }
        
    }
    
}