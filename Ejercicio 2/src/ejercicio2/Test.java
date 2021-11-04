package ejercicio2;

public class Test {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("CatDog");
        Animal a = new Fish();
        Animal e = new Spider();
        Cat p = new Cat();
        p.setNombre("xxxx");
        d.play();
        d.eat();
        d.walk();
        c.getNombre();
        p.getNombre();
        p.eat();
        p.walk();
        e.walk();
        e.eat();
    }
}
