public class Main {

  public static void main(String[] args) {

    Employee zak = new Employee("Zak");
    Employee sarah = new Employee("Sarah");
    Employee anna = new Employee("Anna");

    StaffList allStaff = new StaffList();
    allStaff.add(zak);
    allStaff.add(sarah);
    allStaff.add(anna);

    for (Employee someone: allStaff){
      System.out.println(someone);
    }
  }

}
