package ProgramacionOrientadaObjetos;

public class Car {
    private String brand;
    private String model;

    public Car(String brand, String model) { // (4)
        this.brand = brand;
        this.model = model;
    }

    public void showData() {
        System.out.println("Auto -> Marca: " + brand + ", Modelo: " + model);
    }
}
