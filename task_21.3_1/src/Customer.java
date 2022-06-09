public class Customer {

  private float money;

  public Customer() {
    this.money = 12000;
  }

  public float getMoney(){
    return this.money;
  }

  public void pay(PaymentMethod method, int amount){
    System.out.println("Money = " + getMoney() + ";  Paying...");
    method.pay(amount);
    this.money = this.money - amount;
  }


}
