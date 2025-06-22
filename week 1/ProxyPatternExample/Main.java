package ProxyPatternExample;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("college_project_diagram.png");

        System.out.println("First call:");
        image.display();  // Loads and displays

        System.out.println("\nSecond call:");
        image.display();  // Just displays, no loading
    }
}
