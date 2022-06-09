public class BankAccountPayment implements PaymentMethod{
    public void pay(int amount) {
        System.out.println(amount + " $ from bank account");
    }
}
