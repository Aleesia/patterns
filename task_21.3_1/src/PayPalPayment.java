public class PayPalPayment implements PaymentMethod{
    public void pay(int amount) {
        System.out.println(amount + " $ with PayPal");
    }
}
