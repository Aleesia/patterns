public class Dough {
    enum Flour {
        flour_3,
        flour_65
    }

    enum Thickness {
        thin,
        thick,
        standard
    }

    private Flour flour;
    private String color;
    private Thickness thick;
    private int cost;

    public Dough() {
        this.flour = Flour.flour_3;
        this.color = "white";
        this.thick = Thickness.standard;
        this.cost = 30;
    }

    public Dough(Flour flour) {
        this.flour = flour;
        this.color = "green";
        this.thick = Thickness.standard;
        this.cost = 40;

    }

    public Dough(Flour flour, String color) {
        this.flour = flour;
        this.color = color;
        this.thick = Thickness.standard;
        this.cost = 47;

    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Dough{" +
                "flour=" + flour +
                ", color='" + color + '\'' +
                ", thick=" + thick +
                '}';
    }
}
