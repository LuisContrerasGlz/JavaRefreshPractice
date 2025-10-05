package programacionorientadaobjetos;

public class Inheritance {
    public static void main(String[] args) {

        // Herencia ("es un")

        var animal = new Animal("Mi animal");
//        animal.name = "Mi animal";
        animal.eat();

        var dog = new Dog("Leia", 3);
//        dog.name = "Leia";
        dog.eat();

        var cat = new Cat("Pandy");
//        cat.name = "Pandy";
        cat.eat();

        var bird = new Bird("Blue");
//        bird.name = "Blue";
        bird.eat();
        bird.fly();
    }

    public static class Animal {

        String name;

        public Animal(String name) {
            this.name = name;
        }

        public void eat() {
            System.out.println("El animal con nombre " + name + " está comiendo.");
        }
    }

    public static class Dog extends Animal {

        int age;

        public Dog(String name, int age) {
            super(name);
            this.age = age;
        }

        @Override
        public void eat() {
            System.out.println("El perro con nombre " + name + " está comiendo.");
        }
    }

    public static class Cat extends Animal {

        public Cat(String name) {
            super(name);
        }
    }

    public static class Bird extends Animal {

        public Bird(String name) {
            super(name);
        }

        public void fly() {
            System.out.println("Está volando");
        }
    }
    
}
