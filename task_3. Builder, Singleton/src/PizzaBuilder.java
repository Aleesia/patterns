public class PizzaBuilder {

    private Pizza.Size pizzaSize;
    private Dough dough;
    private Adding adding;
    private Pizza.Temperature temperature;

    public PizzaBuilder() {
        reset();
    }

    public PizzaBuilder reset() {
        pizzaSize = Pizza.Size.Medium;
        adding = new Cheese();
        dough = new Dough(Dough.Flour.flour_3);
        temperature = Pizza.Temperature.Hot;
        return this;
    }

    public PizzaBuilder setPizzaSize(Pizza.Size pizzaSize) {
        this.pizzaSize = pizzaSize;
        return this;
    }

    public PizzaBuilder setDough(Dough dough) {
        this.dough = dough;
        return this;
    }

    public PizzaBuilder setAdding(Adding adding) {
        this.adding = adding;
        return this;
    }

    public PizzaBuilder setPizzaTemperature(Pizza.Temperature temperature) {
        this.temperature = temperature;
        return this;
    }

    public Pizza build() {
        return new Pizza(pizzaSize, new Dough(), adding, temperature);
    }

}
