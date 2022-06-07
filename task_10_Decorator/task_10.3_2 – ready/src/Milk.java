public class Milk extends Decorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return beverage.description() + " + Milk";
    }

    @Override
    public float cost() {
        return beverage.cost() + 5.0f;
    }
}
