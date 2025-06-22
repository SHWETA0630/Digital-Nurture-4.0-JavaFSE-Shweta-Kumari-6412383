package StrategyPatternExample;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void checkout(int amount) {
        if (paymentStrategy == null) {
            System.out.println("No payment method selected.");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}
