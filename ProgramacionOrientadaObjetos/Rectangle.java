package programacionorientadaobjetos;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) { // (7)
        this.width = width;
        this.height = height;
    }

    public double area() { return width * height; }
    public double perimeter() { return 2 * (width + height); }
}
