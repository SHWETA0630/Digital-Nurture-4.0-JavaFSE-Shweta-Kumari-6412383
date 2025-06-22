package InventoryManagementSystemDSA;
public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product("P101", "Keyboard", 30, 850.0);
        Product p2 = new Product("P102", "Webcam", 15, 2300.0);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.displayInventory();

        System.out.println("\nUpdating Webcam:");
        manager.updateProduct("P102", 12, 2199.0);
        manager.displayInventory();

        System.out.println("\nDeleting Keyboard:");
        manager.deleteProduct("P101");
        manager.displayInventory();
    }
}
