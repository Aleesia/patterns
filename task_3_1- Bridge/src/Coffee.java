public class Coffee extends Beverage {
    public Coffee(int sugar, BeverageType type) {
        super(sugar, type);
    }

    @Override
    public void prepare() {
        System.out.println("Put some coffee...");
        if (sugar>0){
            System.out.println("Put "+ sugar + " pieces of sugar...");
        }
        type.applyType();
    }

    @Override
    public int cost() {
        return 10 + type.cost();
    }

    @Override
    public void drink() {
        System.out.println("Drink " + this.type + " Coffee");
    }
}
