package StrategyPatternExample;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(2500);

        cart.setPaymentStrategy(new PayPalPayment("shweta@example.com"));
        cart.checkout(1800);

        cart.setPaymentStrategy(new UPIPayment("shweta@upi"));
        cart.checkout(900);
    }
}
