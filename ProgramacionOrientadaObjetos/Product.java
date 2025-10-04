package ProgramacionOrientadaObjetos;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) { // (10)
        this.name = name;
        this.price = price;
    }

    /** Aplica un descuento porcentual (0–100) y retorna el precio final */
    public double applyDiscount(double percent) {
        if (percent < 0) percent = 0;
        if (percent > 100) percent = 100;
        price = price * (1 - percent / 100.0);
        return price;
    }

    public double getPrice() { return price; }
    public String getName() { return name; }
}
