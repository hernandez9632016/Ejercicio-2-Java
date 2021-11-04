package ejercicio2;

public class Spider extends Animal{
    @Override
    public void eat(){
        System.out.println("La araña come insectos");
    }
    @Override
    public void walk(){
        System.out.println("La araña caminan en 8 patas");
    }
    public Spider(){
        super(8);
    }
}
