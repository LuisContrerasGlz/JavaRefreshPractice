package ProgramacionOrientadaObjetos;

public class Dog {
    private String name;

    public Dog(String name) { this.name = name; }

    public void bark() { // (2)
        System.out.println(name + ": ¡Guau!");
    }
}
