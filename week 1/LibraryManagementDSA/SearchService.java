package LibraryManagementDSA;

import java.util.Arrays;
import java.util.Comparator;

public class SearchService {
    public static Book linearSearch(Book[] books, String searchTitle) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(searchTitle)) {
                return b;
            }
        }
        return null;
    }

    public static Book binarySearch(Book[] books, String searchTitle) {
        Arrays.sort(books, Comparator.comparing(Book::getTitle));
        int left = 0, right = books.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = books[mid].getTitle().compareToIgnoreCase(searchTitle);
            if (cmp == 0) return books[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }

        return null;
    }
}
