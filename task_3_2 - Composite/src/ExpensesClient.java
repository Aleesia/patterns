public class ExpensesClient {

  public static void main(String[] args) {
    Manager jane = new Manager("Jane");
    Salesperson bob = new Salesperson("Bob");
    Salesperson sue = new Salesperson("Sue");

    Manager jennie = new Manager("Jennie");
    Salesperson kitty = new Salesperson("Kitty");
    Salesperson rabbit = new Salesperson("Black");
    Salesperson friend = new Salesperson("Sergey");

    SalesTeam team = new SalesTeam(jane);
    team.addWorker(bob);
    team.addWorker(sue);

    SalesTeam jennies_team = new SalesTeam(jennie);
    jennies_team.addWorker(kitty);
    team.addWorker(jennies_team);
    jennies_team.addWorker(rabbit);
    jennies_team.addWorker(friend);


    team.payExpenses(400);

  }



}
