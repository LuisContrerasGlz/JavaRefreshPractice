package programacionorientadaobjetos2;

public class Employee {
    private double salary = 1000; // salario base

    public double getSalary() { return salary; }

    public void raiseSalary(double percent) {
        if (percent > 0) {
            salary += salary * percent / 100;
        } else {
            System.out.println("Porcentaje inválido");
        }
    }
}
