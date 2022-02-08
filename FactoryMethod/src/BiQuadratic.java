import java.util.ArrayList;

import static java.lang.Math.sqrt;

public class BiQuadratic extends Equation {
    private final double a;
    private final double b;
    private final double c;

    public BiQuadratic(ArrayList<Double> args) {
        super(args);
        this.a = args.get(0);
        this.b = args.get(2);
        this.c = args.get(4);
    }

    @Override
    public ArrayList<Double> solve() {
        ArrayList<Double> solutions = new ArrayList<>();


        double d = b*b-4*a*c;
        if (d > 0) {
            double x1 = (-b+sqrt(d)) / (2*a);
            double x2 = (-b-sqrt(d)) / (2*a);
            if (x1 > 0) {
                solutions.add(sqrt(x1));
                solutions.add(-sqrt(x1));
            }
            else if (x1==0){
                solutions.add(x1);
            }
            if (x2 > 0) {
                solutions.add(sqrt(x2));
                solutions.add(-sqrt(x2));
            }
            else if (x2==0) {
                solutions.add(x2);
            }
        }
        if (d == 0) {
            double x = -b/(2*a);
            if (x==0) {
                solutions.add(x);
            }
            else if (x > 0) {
                solutions.add(sqrt(x));
                solutions.add(-sqrt(x));
            }
        }
        return solutions;
    }

    @Override
    public String toString() {
        return "BiQuadratic{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
