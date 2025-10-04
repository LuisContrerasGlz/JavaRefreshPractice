package ProgramacionOrientadaObjetos;

public class Student {
    private int score;

    public Student(int score) { this.score = score; } // (5)

    public boolean approved() { return score >= 60; }
}
