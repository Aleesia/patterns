public class Crema extends Decorator {
    public Crema(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return beverage.description() + " + Crema";
    }

    @Override
    public float cost() {
        return beverage.cost() + 7.0f;
    }
}

