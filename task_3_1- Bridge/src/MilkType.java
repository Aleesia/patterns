public class MilkType implements BeverageType {

    @Override
    public void applyType() {
        System.out.println("Setting beverage type to MILK");
    }

    public int cost(){
        return 4;
    }

    @Override
    public String toString() {
        return "Milk";
    }
}