public class CashPayment implements PaymentMethod{
    public void pay(int amount) {
        System.out.println(amount + " $ in cash");
    }
}
