public class Director {
    private static Director instance;
    private Director() {}

    public static Director getInstance() {
        if (instance == null) {
            instance = new Director();
        }
        return instance;
    }

    final private PizzaBuilder pizzaBuilder = new PizzaBuilder();

    public Pizza makeDefault() {
        return pizzaBuilder
                .reset()
                .build();
    }

    public Pizza makeLargeCheesePizza() {
        return pizzaBuilder
                .reset()
                .setPizzaSize(Pizza.Size.Large)
                .setDough(new Dough(Dough.Flour.flour_65, "yellow"))
                .setAdding(new Cheese())
                .setPizzaTemperature(Pizza.Temperature.Warm)
                .build();
    }

    public Pizza makeTinyMeatPizza() {
        return pizzaBuilder
                .reset()
                .setPizzaSize(Pizza.Size.Tiny)
                .setDough(new Dough(Dough.Flour.flour_3,"red"))
                .setAdding(new Sausage())
                .setPizzaTemperature(Pizza.Temperature.Hot)
                .build();
    }

}
