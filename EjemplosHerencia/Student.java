package EjemplosHerencia;

class Student extends Person {
    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void study() {
        System.out.println(getName() + " is studying...");
    }

    public int getGrade() { return grade; }
}
