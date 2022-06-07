public class Vershky extends Decorator {
    public Vershky(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return beverage.description() + " + Vershky";
    }

    @Override
    public float cost() {
        return beverage.cost() + 4.0f;
    }
}

