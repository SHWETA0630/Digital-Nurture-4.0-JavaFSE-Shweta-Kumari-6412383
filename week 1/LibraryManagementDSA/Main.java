package LibraryManagementDSA;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book("B101", "The Alchemist", "Paulo Coelho"),
            new Book("B102", "Sapiens", "Yuval Noah Harari"),
            new Book("B103", "Atomic Habits", "James Clear"),
            new Book("B104", "Clean Code", "Robert C. Martin"),
            new Book("B105", "Ikigai", "Héctor García")
        };

        Book linearResult = SearchService.linearSearch(books, "Ikigai");
        System.out.println("Linear Search  " + (linearResult != null ? linearResult : "Book not found"));

        Book binaryResult = SearchService.binarySearch(books, "Ikigai");
        System.out.println("Binary Search  " + (binaryResult != null ? binaryResult : "Book not found"));
    }
}
