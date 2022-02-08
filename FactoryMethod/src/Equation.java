import java.util.ArrayList;

public class Equation {

    final private double b;
    final private double c;

    public Equation(ArrayList<Double> args) {
        this.b = args.get(0);
        this.c = args.get(1);
    }

    public ArrayList<Double> solve()
    {
        ArrayList<Double> solutions = new ArrayList<>();
        if ((b == 0) && (c == 0)) {
            for (int i = 0; i < 6; i++) {
                solutions.add((double) i);
            }
        }else {
            if (b != 0) {
                solutions.add(-c / b);
            }
        }
        return solutions;
    };

    @Override
    public String toString() {
        return "LinearEquation{" +
                "b=" + b +
                ", c=" + c +
                '}';
    }
}
