package programacionorientadaobjetos2;

public class Car {
    private int speed;

    public int getSpeed() { return speed; }

    public void accelerate(int amount) {
        if (amount > 0) {
            speed += amount;
            if (speed > 120) speed = 120;
        }
    }

    public void brake(int amount) {
        if (amount > 0) {
            speed -= amount;
            if (speed < 0) speed = 0;
        }
    }
}
