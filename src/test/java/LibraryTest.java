import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library("Library of Alexandria", 3);
        book = new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy");
    }

    @Test
    public void hasName(){
        assertEquals("Library of Alexandria", library.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void stockStartsAtZero(){
        assertEquals(0, library.checkStock());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.checkStock());
    }

    @Test
    public void cannotAddBookIfMaxCapacity(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.checkStock());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book);
        library.addBook(book);
        library.removeBook(book);
        assertEquals(1, library.checkStock());
    }
}
