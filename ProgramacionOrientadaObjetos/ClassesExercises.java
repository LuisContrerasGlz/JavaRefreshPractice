package ProgramacionOrientadaObjetos;

import java.util.ArrayList;
import java.util.List;

public class ClassesExercises {

    public static void main(String[] args) {
        run1y3_Book();
        run2_Dog();
        run4_Car();
        run5_Student();
        run6_BankAccount();
        run7_Rectangle();
        run8_Worker();
        run9_ArrayListPerson();
        run10_ProductDiscount();
    }

    // 1 y 3. Book con constructor + mostrar datos
    private static void run1y3_Book() {
        Book b1 = new Book("Clean Code", "Robert C. Martin");
        System.out.println("[1&3] Libro: " + b1); // toString()
        System.out.println();
    }

    // 2. Dog.bark()
    private static void run2_Dog() {
        Dog d1 = new Dog("Firulais");
        System.out.print("[2] ");
        d1.bark();
        System.out.println();
    }

    // 4. Car.showData()
    private static void run4_Car() {
        Car c1 = new Car("Toyota", "Corolla");
        System.out.print("[4] ");
        c1.showData();
        System.out.println();
    }

    // 5. Student.approved()
    private static void run5_Student() {
        Student st = new Student(72);
        System.out.printf("[5] ¿Aprobó (%d)? %b%n%n", 72, st.approved());
    }

    // 6. BankAccount.deposit()
    private static void run6_BankAccount() {
        BankAccount acc = new BankAccount(1000.0);
        acc.deposit(250.0);    // válido
        acc.deposit(-50.0);    // inválido, mostrará aviso
        System.out.printf("[6] Saldo actual: $%.2f%n%n", acc.getBalance());
    }

    // 7. Rectangle: área y perímetro
    private static void run7_Rectangle() {
        Rectangle r = new Rectangle(5.0, 3.0);
        System.out.printf("[7] Área = %.2f, Perímetro = %.2f%n%n", r.area(), r.perimeter());
    }

    // 8. Worker.showSalary()
    private static void run8_Worker() {
        Worker w = new Worker("Ana", 18500.0);
        System.out.print("[8] ");
        w.showSalary();
        System.out.println();
    }

    // 9. Varios Person en una lista
    private static void run9_ArrayListPerson() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Luis", 30));
        people.add(new Person("María", 25));
        people.add(new Person("Carlos", 40));

        System.out.println("[9] Personas en la lista:");
        for (Person p : people) {
            System.out.println(" - " + p);
        }
        System.out.println();
    }

    // 10. Product.applyDiscount()
    private static void run10_ProductDiscount() {
        Product prod = new Product("Teclado mecánico", 1200.0);
        double finalPrice = prod.applyDiscount(15); // 15%
        System.out.printf("[10] %s -> Precio con 15%% off: $%.2f%n", prod.getName(), finalPrice);
    }
}
