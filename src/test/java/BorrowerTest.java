import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower;

    @Before
    public void before(){
        borrower = new Borrower("Andrew");
    }

    @Test
    public void hasName(){
        assertEquals("Andrew", borrower.getName());
    }

    @Test
    public void cardStartsAtZero(){
        assertEquals(0, borrower.checkCard());
    }
}
