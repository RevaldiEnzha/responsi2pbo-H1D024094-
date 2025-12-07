public class PaymentTest {
    public static void main(String[] args) {
        EWalletPayment a=new EWalletPayment("OVO", 150000, 50000);
        a.processPayment();
        a.getPaymentDetails();

    }
}
