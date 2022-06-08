import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class EngineFactory {
    static Map<Engine.Fuel, Engine> engines = new HashMap<>();

    public static Engine getEngine(Engine.Fuel fuel, int power) {
        Engine result = engines.get(fuel);
        if (result == null) {
            result = new Engine(fuel, power);
            engines.put(fuel, result);
        }
        return result;
    }
}
