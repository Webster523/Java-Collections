package lecture2.iterator;

import java.util.Collection;
import java.util.HashSet;

public class TestForeach {
    public static void main(String[] args) {
        Collection<String> books = new HashSet<>();
        books.add("One book");
        books.add("Two book");
        books.add("Three book");

        for (var book : books) {
            System.out.println(book);
        }

        System.out.println(books);

        books.forEach(System.out::println);
    }
}

