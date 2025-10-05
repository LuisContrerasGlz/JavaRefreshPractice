package EjemplosHerencia;

class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) { this.name = name; this.salary = salary; }

    public String describe() {
        return "Employee " + name + " earns " + salary;
    }
}
