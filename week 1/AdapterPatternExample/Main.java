package AdapterPatternExample;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor razorPayProcessor = new RazorPayAdapter();
        razorPayProcessor.processPayment(1500);

        PaymentProcessor payPalProcessor = new PayPalAdapter();
        payPalProcessor.processPayment(2200);
    }
}
