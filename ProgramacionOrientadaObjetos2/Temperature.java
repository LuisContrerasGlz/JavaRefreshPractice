package ProgramacionOrientadaObjetos2;

public class Temperature {
    private double celsius;

    public double getCelsius() { return celsius; }

    public void setCelsius(double celsius) {
        if (celsius >= -100 && celsius <= 100) {
            this.celsius = celsius;
        } else {
            System.out.println("Temperatura fuera de rango");
        }
    }
}
