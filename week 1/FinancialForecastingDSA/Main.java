package FinancialForecastingDSA;

public class Main {
    public static void main(String[] args) {
        double initial = 10000.0;
        double growthRate = 0.05; // 5%
        int years = 5;

        double resultRecursive = ForecastService.forecastRecursive(initial, growthRate, years);
        double resultIterative = ForecastService.forecastIterative(initial, growthRate, years);

        System.out.println("Forecast (Recursive): Rs." + resultRecursive);
        System.out.println("Forecast (Iterative): Rs." + resultIterative);
    }
}
