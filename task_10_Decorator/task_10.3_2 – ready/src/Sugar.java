public class Sugar extends Decorator {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return beverage.description() + " + Sugar";
    }

    @Override
    public float cost() {
        return beverage.cost() + 2.0f;
    }
}

