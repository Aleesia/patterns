public class FineVisitor implements Visitor {

    private int fine;

    public FineVisitor(int fine) {
        this.fine = fine;
    }

    @Override
    public void visit(Manager manager) {
        manager.setSalary(manager.getSalary() - fine);
    }

    @Override
    public void visit(SalesPerson salesPerson) {
        salesPerson.setSalary(salesPerson.getSalary() - fine);
    }

    @Override
    public void visit(StaffList list) {
        System.out.println("Fined everyone!");
    }

    @Override
    public void visit(Cleaner cleaner) {
        cleaner.setSalary(cleaner.getSalary() - fine);
    }
}
