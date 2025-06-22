package InventoryManagementSystemDSA;
import java.util.HashMap;

public class InventoryManager {
    private HashMap<String, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, int newQty, double newPrice) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setQuantity(newQty);
            product.setPrice(newPrice);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(String productId) {
        if (inventory.remove(productId) == null) {
            System.out.println("Product not found.");
        }
    }

    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Inventory Listing:");
            for (Product p : inventory.values()) {
                System.out.println(p);
            }
        }
    }
}
