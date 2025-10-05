package funciones;

public class OverloadExample {

    // mismo nombre, diferente número de parámetros
    void saludar() {
        System.out.println("Hola!");
    }

    void saludar(String nombre) {
        System.out.println("Hola " + nombre + "!");
    }

    // mismo nombre, mismo número pero distinto tipo de parámetro
    int sumar(int a, int b) {
        return a + b;
    }

    double sumar(double a, double b) {
        return a + b;
    }

    // mismo nombre, mismo número, tipos distintos y en distinto orden
    void mostrar(String texto, int numero) {
        System.out.println("Texto: " + texto + ", Número: " + numero);
    }

    void mostrar(int numero, String texto) {
        System.out.println("Número: " + numero + ", Texto: " + texto);
    }

    public static void main(String[] args) {
        OverloadExample ex = new OverloadExample();
        ex.saludar();
        ex.saludar("Luis");
        System.out.println(ex.sumar(2, 3));
        System.out.println(ex.sumar(2.5, 3.5));
        ex.mostrar("Hola", 10);
        ex.mostrar(20, "Adiós");
    }
}
