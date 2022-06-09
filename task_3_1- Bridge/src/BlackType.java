public class BlackType implements BeverageType {
    @Override
    public void applyType() {
        System.out.println("Setting beverage type to BLACK");
    }

    public int cost(){
        return 0;
    }

    @Override
    public String toString() {
        return "Black";
    }
}
