package AdapterPatternExample;

public class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway payPal = new PayPalGateway();

    @Override
    public void processPayment(double amount) {
        payPal.sendMoney(amount);
    }
}
