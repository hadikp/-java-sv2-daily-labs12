package day06.library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookSearch {

    private List<Book> books;

    public BookSearch(List<Book> books) {
        this.books = books;
    }

    public Book findBookByAuthorTitle(String author, String title) {
        isBlankString(author);
        isBlankString(title);
        Collections.sort(books);
        int index = Collections.binarySearch(books, new Book(author, title));
        if (index < 0) {
            throw new IllegalArgumentException("Nem található a keresett könyv!");
        }
        return books.get(index);
    }

    private void isBlankString(String author) {
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Nem lehet üres string a bemenet!");
        }
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }
}
