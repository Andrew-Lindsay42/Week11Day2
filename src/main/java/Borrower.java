import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> card;

    public Borrower(String name){
        this.name = name;
        this.card = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int checkCard(){
        return this.card.size();
    }
}
