package AdapterPatternExample;

public class PayPalGateway {
    public void sendMoney(double value) {
        System.out.println("Sent Rs." + value + " using PayPal.");
    }
}
