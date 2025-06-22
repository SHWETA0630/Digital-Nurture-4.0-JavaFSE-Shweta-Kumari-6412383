package FinancialForecastingDSA;

public class ForecastService {
    public static double forecastRecursive(double initialValue, double rate, int period) {
        if (period == 0) return initialValue;
        return (1 + rate) * forecastRecursive(initialValue, rate, period - 1);
    }

    public static double forecastIterative(double initialValue, double rate, int period) {
        double value = initialValue;
        for (int i = 0; i < period; i++) {
            value *= (1 + rate);
        }
        return value;
    }
}
