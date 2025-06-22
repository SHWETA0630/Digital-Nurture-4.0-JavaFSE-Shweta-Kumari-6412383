package EcommerceSearchFunctionDSA;
public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Shoes", "Fashion"),
            new Product("P003", "Watch", "Accessories"),
            new Product("P004", "Phone", "Electronics"),
            new Product("P005", "Tablet", "Electronics")
        };

        Product result1 = SearchService.linearSearch(products, "Watch");
        System.out.println("Linear: " + (result1 != null ? result1 : "Not Found"));

        Product result2 = SearchService.binarySearch(products, "Watch");
        System.out.println("Binary: " + (result2 != null ? result2 : "Not Found"));
    }
}
