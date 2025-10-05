package ProgramacionOrientadaObjetos2;

public class Student {
    private int grade;

    public int getGrade() { return grade; }
    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) this.grade = grade;
    }

    public boolean isPassed() { return grade >= 60; }
}
