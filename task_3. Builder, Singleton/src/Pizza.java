public class Pizza {

    enum Temperature {
        Hot,
        Warm,
        Cold,
        Frozen,
    }

    enum Size {
        Large,
        Medium,
        Small,
        Tiny
    }


    public Pizza(Size size, Dough dough, Adding adding, Temperature temperature) {
        this.size = size;
        this.dough = dough;
        this.adding = adding;
        this.temperature = temperature;
    }

    public Size getSize() {
        return size;
    }

    public Dough getDough() {
        return dough;
    }

    public Adding getAdding() {
        return adding;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Pizza:\n" +
                "size=" + size +
                ",\ndough=" + dough +
                ",\naddings=" + adding +
                ",\ntemperature=" + temperature +
                "\n";
    }

    final private Size size;
    final private Dough dough;
    final private Adding adding;
    final private Temperature temperature;

    private int cost(Pizza.Size size){
        if (size.equals(Size.Tiny)) {return 1;}
        else if  (size.equals(Size.Small)) {return 2;}
        else if (size.equals(Size.Medium)) {return 3;}
        else if (size.equals(Size.Large)) {return 4;}
        else {return 0;}
    }

    public int getCost(){
        return (adding.getCost()+dough.getCost())*cost(size);
    }

}
