package ejercicio2;

public class Cat extends Animal implements Pet{
    String nombre;
    public Cat(String nombre){
        super(4);
        this.nombre = nombre;
    }

    public Cat(){
        super(4);
        Cat cat = new   Cat("");
    }
    @Override
    public void eat(){
        System.out.println("Los gatos comen peces");
    }
    @Override
    public void walk() {
        System.out.println("Los gatos caminan en cuatro");
    }

    public void getNombre() {
        System.out.println(nombre);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public  void play(){
        System.out.println("xxxxxxxxxxxx");
    }
}
