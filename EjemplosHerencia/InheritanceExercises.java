package EjemplosHerencia;

import java.util.ArrayList;

public class InheritanceExercises {
    public static void main(String[] args) {

        // 1. Vehicle -> Car
        Car car = new Car();
        car.move();
        car.honk();
        System.out.println();

        // 2. Person -> Student
        Student st = new Student("Luis", 20, 85);
        st.study();
        System.out.println(st.getName() + " (" + st.getAge() + ") grade=" + st.getGrade());
        System.out.println();

        // 3. Animal -> Dog/Cat (override makeSound)
        Animal d = new Dog();
        Animal c = new Cat();
        d.makeSound();
        c.makeSound();
        System.out.println();

        // 4. Employee -> Manager
        Manager m = new Manager("Ana", 25000, "Ventas");
        System.out.println(m.describe());
        System.out.println();

        // 5. Shape abstract -> Circle/Rectangle
        Shape s1 = new Circle(3.0);
        Shape s2 = new Rectangle(5.0, 2.0);
        System.out.println("Circle area = " + s1.calculateArea());
        System.out.println("Rectangle area = " + s2.calculateArea());
        System.out.println();

        // 6. Bird.fly() y Eagle.fly() usando super
        Bird b = new Bird();
        b.fly();
        Eagle e = new Eagle();
        e.fly();
        System.out.println();

        // 7. Device -> Phone (constructores)
        Phone phone = new Phone();
        System.out.println();

        // 8. Account -> SavingsAccount
        SavingsAccount sa = new SavingsAccount(1000, 0.05);
        sa.deposit(500);
        sa.addInterest();
        sa.withdraw(300);
        System.out.println("Savings balance = " + sa.getBalance());
        System.out.println();

        // 9. Vehicle subclases con describe() override
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        Vehicle v3 = new Truck();
        System.out.println(v1.describe());
        System.out.println(v2.describe());
        System.out.println(v3.describe());
        System.out.println();

        // 10. ArrayList<Animal> con Dog, Cat y Bird llamando makeSound()
        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(new Dog());
        zoo.add(new Cat());
        zoo.add(new Bird()); // Bird también implementa makeSound()
        for (Animal a : zoo) a.makeSound();
    }
}
