import java.util.ArrayList;

public class QuadraticFactory extends EquationFactory {
    @Override
    public Equation create(ArrayList<Double> args) {
        return new Quadratic(args);
    }
}
