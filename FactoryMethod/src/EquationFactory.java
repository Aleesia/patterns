import java.util.ArrayList;

public class EquationFactory {
    public Equation create(ArrayList<Double> args) {
        return new Equation(args);
    };
}
