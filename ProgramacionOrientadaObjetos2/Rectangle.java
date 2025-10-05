package ProgramacionOrientadaObjetos2;

public class Rectangle {
    private double width;
    private double height;

    public void setWidth(double width) { if (width > 0) this.width = width; }
    public void setHeight(double height) { if (height > 0) this.height = height; }

    public double calculateArea() { return width * height; }
}
