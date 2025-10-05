package programacionorientadaobjetos2;

public class AccessModifiersExercises {
    public static void main(String[] args) {

        // 1. Person con getters/setters
        Person p = new Person();
        p.setName("Luis");
        p.setAge(25);
        System.out.println("[1] " + p.getName() + " tiene " + p.getAge() + " años");

        // 2. Product con validación en setPrice
        Product prod = new Product();
        prod.setPrice(150.5);
        System.out.println("[2] Precio del producto: $" + prod.getPrice());

        // 3. BankAccount con deposit/withdraw
        BankAccount acc = new BankAccount();
        acc.deposit(500);
        acc.withdraw(200);
        acc.withdraw(1000); // debería fallar
        System.out.println("[3] Saldo cuenta: $" + acc.getBalance());

        // 4. Book solo con getTitle()
        Book b = new Book("Clean Code");
        System.out.println("[4] Libro: " + b.getTitle());

        // 5. Temperature con validación de rango
        Temperature t = new Temperature();
        t.setCelsius(30);
        t.setCelsius(150); // inválido
        System.out.println("[5] Temperatura: " + t.getCelsius() + "°C");

        // 6. User con checkPassword
        User u = new User();
        u.setUsername("admin");
        u.setPassword("1234");
        System.out.println("[6] Password correcta? " + u.checkPassword("1234"));
        System.out.println("    Password incorrecta? " + u.checkPassword("9999"));

        // 7. Employee con raiseSalary
        Employee e = new Employee();
        e.raiseSalary(10); // +10%
        e.raiseSalary(-5); // inválido
        System.out.println("[7] Salario final: $" + e.getSalary());

        // 8. Rectangle con calculateArea()
        Rectangle r = new Rectangle();
        r.setWidth(5);
        r.setHeight(3);
        System.out.println("[8] Área rectángulo = " + r.calculateArea());

        // 9. Student con grade e isPassed()
        Student st = new Student();
        st.setGrade(72);
        System.out.println("[9] ¿Pasó con " + st.getGrade() + "? " + st.isPassed());

        // 10. Car con accelerate/brake
        Car c = new Car();
        c.accelerate(50);
        c.accelerate(100); // debería limitar en 120
        c.brake(30);
        c.brake(200); // debería limitar en 0
        System.out.println("[10] Velocidad final: " + c.getSpeed() + " km/h");
    }
}
