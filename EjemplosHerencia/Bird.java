package EjemplosHerencia;

class Bird extends Animal {
    public void fly() {
        System.out.println("Bird is flying...");
    }
    @Override
    public void makeSound() {
        System.out.println("Bird: Chirp");
    }
}
