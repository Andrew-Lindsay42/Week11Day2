import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower;
    Library library;
    Book hobbit;
    Book dune;

    @Before
    public void before(){
        borrower = new Borrower("Andrew");
        hobbit = new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy");
        dune = new Book("Dune", "Frank Herbert", "Sci-Fi");
        library = new Library("Library of Alexandria", 3);
        library.addBook(hobbit);
    }

    @Test
    public void hasName(){
        assertEquals("Andrew", borrower.getName());
    }

    @Test
    public void cardStartsAtZero(){
        assertEquals(0, borrower.checkCard());
    }

    @Test
    public void canBorrowBook(){
        borrower.borrowBook(hobbit, library);
        assertEquals(1, borrower.checkCard());
        assertEquals(0, library.checkStock());
    }

    @Test
    public void cannotBorrowBookIfNotInLibrary(){
        borrower.borrowBook(dune, library);
        assertEquals(0, borrower.checkCard());
        assertEquals(1, library.checkStock());
    }

    @Test
    public void canReturnBook(){
        library.addBook(dune);
        borrower.borrowBook(hobbit, library);
        borrower.borrowBook(dune, library);
        assertEquals(2, borrower.checkCard());
        assertEquals(0, library.checkStock());
        borrower.returnBook(hobbit, library);
        assertEquals(1, borrower.checkCard());
        assertEquals(1, library.checkStock());
    }

    @Test
    public void cannotReturnBookIfNotOnCard(){
        borrower.returnBook(dune, library);
        assertEquals(0, borrower.checkCard());
        assertEquals(1, library.checkStock());
    }
}
