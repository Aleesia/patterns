public abstract class Beverage {

    protected final int sugar;
    public BeverageType type;

    public Beverage(int sugar, BeverageType type) {
        this.sugar = sugar;
        this.type = type;
    }


    public abstract void prepare();
    public abstract void drink();
    public abstract int cost();
}
