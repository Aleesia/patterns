public class Main {

  public static void main(String[] args) {
    Customer customer = new Customer();
    PayPalPayment payPal = new PayPalPayment();
    BankAccountPayment bankPayment = new BankAccountPayment();
    CashPayment cashPay = new CashPayment();

    customer.pay(payPal,210);
    customer.pay(bankPayment, 678);

    customer.pay(cashPay, 23);
    customer.pay(cashPay, 8);

  }

}
