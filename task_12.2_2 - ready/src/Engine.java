import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Engine {
    public enum Fuel {
        Petrol,
        Diesel,
        Electric,
        Gas
    }

    final Fuel fuel;
    final int power;

    public Engine(Fuel fuel, int power) {
        this.power = power;
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "fuel=" + fuel +
                ", power=" + power +
                '}';
    }
}
