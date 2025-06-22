package OrderSortingDSA;
public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O101", "Anaya", 1999.0),
            new Order("O102", "Kabir", 459.0),
            new Order("O103", "Zoya", 5500.0),
            new Order("O104", "Ravi", 1250.0),
            new Order("O105", "Sara", 3299.0)
        };

        System.out.println("Original Orders:");
        for (Order o : orders) System.out.println(o);

        SortingService.bubbleSort(orders);
        System.out.println("\nBubble Sorted by Price:");
        for (Order o : orders) System.out.println(o);

        Order[] moreOrders = {
            new Order("O101", "Anaya", 1999.0),
            new Order("O102", "Kabir", 459.0),
            new Order("O103", "Zoya", 5500.0),
            new Order("O104", "Ravi", 1250.0),
            new Order("O105", "Sara", 3299.0)
        };

        SortingService.quickSort(moreOrders, 0, moreOrders.length - 1);
        System.out.println("\nQuick Sorted by Price:");
        for (Order o : moreOrders) System.out.println(o);
    }
}
