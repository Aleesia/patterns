public class Cafe {

    public static void main(String[] args) {
        Chocolate blackChocolate = new Chocolate(3, new BlackType());
        Coffee blackCoffee = new Coffee(3, new BlackType());
        Tee blackTee = new Tee(0, new BlackType());

        beverageInfo(blackChocolate);
        beverageInfo(blackCoffee);
        beverageInfo(blackTee);

        Chocolate milkChocolate = new Chocolate(3, new MilkType());
        Coffee coffeeWithMilk = new Coffee(3, new MilkType());
        Tee teeWithMilk = new Tee(2, new MilkType());

        beverageInfo(milkChocolate);
        beverageInfo(coffeeWithMilk);
        beverageInfo(teeWithMilk);
    }

    private static void beverageInfo(Beverage beverage) {

        System.out.println("=========================");

        beverage.prepare();
        System.out.printf("Cost of beverage: %s grn\n",  beverage.cost());
        beverage.drink();
    }

}
