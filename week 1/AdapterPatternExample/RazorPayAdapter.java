package AdapterPatternExample;

public class RazorPayAdapter implements PaymentProcessor {
    private RazorPayGateway razorPay = new RazorPayGateway();

    @Override
    public void processPayment(double amount) {
        razorPay.makePayment(amount);
    }
}
