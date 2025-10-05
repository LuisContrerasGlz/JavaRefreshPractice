package ejemplosherencia;

class Car extends Vehicle {
    public void honk() {
        System.out.println("Car: Beep beep!");
    }
    @Override
    public String describe() {
        return "Car: 4 wheels, comfortable for roads.";
    }
}
