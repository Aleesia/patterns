abstract public class Decorator extends Beverage {

    final protected Beverage beverage;

    public Decorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
