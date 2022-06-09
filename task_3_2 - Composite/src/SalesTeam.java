import java.util.ArrayList;
import java.util.List;

public class SalesTeam extends Worker {

    private final Manager manager;
    private final List<Worker> otherWorkers = new ArrayList<>();

    public SalesTeam(Manager manager) {
        this.manager = manager;
    }

    void addWorker(Worker worker) {
        otherWorkers.add(worker);
    }

    public void payExpenses(double amount) {
        manager.payExpenses(0.5*amount);
        int size = otherWorkers.size();
        double amount_1 = 0.5*amount/size;

        for (Worker worker : otherWorkers) {
            worker.payExpenses(amount_1);
        }

    }

}
