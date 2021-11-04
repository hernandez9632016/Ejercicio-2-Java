package ejercicio2;

public interface Pet {
    String nombre = "";

    default void getNombre(){}
    default void setNombre(){}
    default void play(){}
}
