/*
jercicio 1 (Parcial 1 — Herencia y super)
Completá la subclase Perro que hereda de Animal:

    1. Atributo privado raza de tipo String.
    2. Constructor public Perro(String nombre, String raza) 
    que llame al constructor del padre para inicializar nombre y guarde raza.
    3. Sobrescribí hacerSonido() para que imprima "Guau".
*/

class Animal {
    private String nombre;
    public Animal(String nombre) { this.nombre = nombre; }
    public void hacerSonido() { System.out.println("..."); }
}

class Perro /* 1. Herencia */ extends Animal{
    
    // 2. Atributo privado:
    private String raza;

    // 3. Constructor con llamada a super:
    public Perro(String nombre , String raza){
        
        super(nombre);
        this.raza = raza;
        
    }
    
    // 4. Sobrescritura de hacerSonido():
    @Override
    public void hacerSonido(){ 
        
        System.out.println("Guau"); 
        
    }
    
}