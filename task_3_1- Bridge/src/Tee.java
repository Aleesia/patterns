public class Tee extends Beverage {
    public Tee(int sugar, BeverageType type) {
        super(sugar, type);
    }

    @Override
    public void prepare() {
        System.out.println("Put some tee...");
        if (sugar>0){
            System.out.println("Put "+ sugar + " pieces of sugar...");
        }
        type.applyType();
    }

    @Override
    public int cost() {
        return 7+type.cost();
    }

    @Override
    public void drink() {
        System.out.println("Drink " + this.type + " Tee");

    }
}
