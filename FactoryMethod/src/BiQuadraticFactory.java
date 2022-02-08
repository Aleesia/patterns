import java.util.ArrayList;

public class BiQuadraticFactory extends EquationFactory {
    @Override
    public Equation create(ArrayList<Double> args) {
        return new BiQuadratic(args);
    }

}
