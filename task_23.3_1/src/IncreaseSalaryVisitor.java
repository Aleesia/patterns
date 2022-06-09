public class IncreaseSalaryVisitor implements Visitor {

    private int percent;

    public IncreaseSalaryVisitor(int percent) {
        this.percent = percent;
    }

    @Override
    public void visit(Manager manager) {
        manager.setSalary(manager.getSalary()*(percent+100)/100);
    }

    @Override
    public void visit(SalesPerson salesPerson) {
        salesPerson.setSalary(salesPerson.getSalary()*(percent+100)/100);
    }

    @Override
    public void visit(StaffList list) {
        System.out.println("Salaries increased...");
    }

    @Override
    public void visit(Cleaner cleaner) {
        cleaner.setSalary(cleaner.getSalary()*(percent+100)/100);
    }
}