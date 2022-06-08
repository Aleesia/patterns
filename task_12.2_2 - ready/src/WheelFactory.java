import java.awt.*;
import java.util.HashMap;
import java.util.Map;


public class WheelFactory {
    static Map<Wheel.Material, Wheel> wheels = new HashMap<>();

    public static Wheel getWheel(Wheel.Material material, int diameter) {
        Wheel result = wheels.get(material);
        if (result == null) {
            result = new Wheel(material, diameter);
            wheels.put(material, result);
        }
        return result;
    }
}
