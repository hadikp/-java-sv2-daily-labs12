package day06.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookSearchTest {

    BookSearch bookSearch;

    @BeforeEach
    void init() {
        Book asimov1 = new Book(1, "Pozitron ember", "Asimov");
        Book asimov2 = new Book(2, "Alapítvány", "Asimov");
        Book asimov3 = new Book(3, "Robotok", "Asimov");
        Book clark = new Book(4, "Űrodusszeia", "Clark");
        List<Book> books = new ArrayList<>(Arrays.asList(asimov1, asimov2, asimov3, clark));
        bookSearch = new BookSearch(books);
    }

    @Test
    void testInputAuthorEmpty() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> bookSearch.findBookByAuthorTitle(null, "Robotok"));
        assertEquals("Nem lehet üres string a bemenet!", iae.getMessage());
    }

    @Test
    void testInputTitleEmpty() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> bookSearch.findBookByAuthorTitle("Asimov", ""));
        assertEquals("Nem lehet üres string a bemenet!", iae.getMessage());
    }

    @Test
    void testSearch() {
        Book expected = bookSearch.findBookByAuthorTitle("Asimov", "Robotok");
        assertEquals(3, expected.getId());
        assertEquals("Asimov", expected.getAuthor());
        assertEquals("Robotok", expected.getTitle());
    }

}