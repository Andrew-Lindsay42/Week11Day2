import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;

    @Before
    public void before(){
        library = new Library();
    }

    @Test
    public void stockStartsAtZero(){
        assertEquals(0, library.checkStock());
    }

    @Test
    public void canAddBook(){
        Book book = new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy");
        library.addBook(book);
        assertEquals(1, library.checkStock());
    }

    @Test
    public void canRemoveBook(){
        Book book = new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy");
        library.addBook(book);
        library.addBook(book);
        library.removeBook(book);
        assertEquals(1, library.checkStock());
    }
}
