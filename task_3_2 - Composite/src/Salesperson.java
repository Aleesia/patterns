public class Salesperson extends Worker{

  private final String name;

  public Salesperson(String name) {
    this.name = name;
  }

  public void payExpenses(double amount) {
    System.out.println("SalesPerson " + name + " has been paid $" + amount);
  }

}
