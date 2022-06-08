import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StaffList implements Iterable<Employee>{


    private final List<Employee> array = new ArrayList<>();

    public void add(Employee person) {
        array.add(person);
    }


    @Override
    public String toString() {
        return "Iterable{" +
                "array=" + array +
                '}';
    }

    public int size() {
        return array.size();
    }

    public Employee get(int i) {
        return array.get(i);
    }

    public List<Employee> getArray() {
        return array;
    }


    @Override
    public Iterator<Employee> iterator() {
        return new StaffListIterator(this);
    }
}
