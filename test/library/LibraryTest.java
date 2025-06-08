package library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library(Arrays.asList(
                new Book("1984", "Оруэлл", true),
                new Book("Мастер и Маргарита", "Булгаков", false)
        ));
    }

    @Test
    public void testFindBookByTitle_found() {
        Book result = library.findBookByTitle("1984");
        assertNotNull(result);
        assertEquals("Оруэлл", result.getAuthor());
    }

    @Test
    public void testFindBookByTitle_notFound() {
        Book result = library.findBookByTitle("Неизвестная книга");
        assertNull(result);
    }
