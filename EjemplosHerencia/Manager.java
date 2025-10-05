package ejemplosherencia;

class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public String describe() {
        return "Manager " + name + " (Dept: " + department + ") earns " + salary;
    }
}
