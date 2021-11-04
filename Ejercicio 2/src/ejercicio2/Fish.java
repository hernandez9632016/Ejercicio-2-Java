package ejercicio2;

public class Fish extends Animal implements Pet {
    public Fish(){
        super(0);
    }
    @Override
    public void play(){
        System.out.println("El pez nada");
    }
    @Override
    public void eat(){
        System.out.println("El pez come algas");
    }
    @Override
    public void walk(){
        System.out.println("El pez no camina");
    }
}
