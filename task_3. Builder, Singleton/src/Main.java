public class Main {
    public static void main(String[] args) {

        Director director = Director.getInstance();

        Pizza pizza = director.makeDefault();
        System.out.println(pizza);
        System.out.println("Cost = " + pizza.getCost());

        Pizza largeCheesePizza = director.makeLargeCheesePizza();
        System.out.println(largeCheesePizza);
        System.out.println("Cost = " + largeCheesePizza.getCost());

        Pizza tinyMeatPizza = director.makeTinyMeatPizza();
        System.out.println(tinyMeatPizza);
        System.out.println("Cost = " + tinyMeatPizza.getCost());
    }
}