package programacionorientadaobjetos;

public class Worker {
    private String name;
    private double salary;

    public Worker(String name, double salary) { // (8)
        this.name = name;
        this.salary = salary;
    }

    public void showSalary() {
        System.out.println(name + " gana $" + salary + " mensuales.");
    }
}
