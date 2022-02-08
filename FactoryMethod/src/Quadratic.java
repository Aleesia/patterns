import java.util.ArrayList;

import static java.lang.Math.sqrt;

public class Quadratic extends Equation {

    private final double a;
    private final double b;
    private final double c;

    public Quadratic(ArrayList<Double> args) {
        super(args);
        this.a = args.get(0);
        this.b = args.get(1);
        this.c = args.get(2);
    }

    @Override
    public ArrayList<Double> solve() {
        ArrayList<Double> solutions = new ArrayList<>();
        double d = b * b - 4 * a * c;
        if (d == 0) {
            solutions.add(-b / (2 * a));
        } else if (d > 0) {
            solutions.add((-b + sqrt(d)) / (2 * a));
            solutions.add((-b - sqrt(d)) / (2 * a));
        }
        return solutions;
    }

    @Override
    public String toString() {
        return "Quadratic{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
