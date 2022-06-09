import java.util.ArrayList;
import java.util.List;

public class Manager extends Worker{

    private final String name;

    public Manager(String name) {
        this.name = name;
    }

    public void payExpenses(double amount) {
        System.out.println("Manager " + name + " has been paid $" + amount);
    }

}
