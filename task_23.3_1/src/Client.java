public class Client {

    public static void main(String[] args) {
        StaffList staffList = new StaffList();

        staffList.addEmployee(new Manager(60000));
        staffList.addEmployee(new SalesPerson(50000));
        staffList.addEmployee(new SalesPerson(40000));
        staffList.addEmployee(new Cleaner(20000));

        System.out.println("Total amount paid to staff: " + staffList.getSalary());

        staffList.accept(new FineVisitor(1000));
        System.out.println("Total salary of all employees: " + staffList.getSalary());
        //System.out.println(coffee.getSalary());

        staffList.accept(new IncreaseSalaryVisitor(30));
        System.out.println("Total salary of all employees: " + staffList.getSalary());
        //System.out.println(coffee.getSalary());
    }

}
