import java.util.ArrayList;
import java.util.Iterator;

public class StaffListIterator implements Iterator<Employee>{
    final private ArrayList<Employee> collectionStaff  = new ArrayList<>();
    private int index = 0;

    public StaffListIterator(StaffList staff) {
        collectionStaff.addAll(staff.getArray());
    }

    @Override
    public boolean hasNext() {
        return index < collectionStaff.size();
    }

    @Override
    public Employee next() {
        return collectionStaff.get(index++);
    }

}
