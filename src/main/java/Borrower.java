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

    public void borrowBook(Book book, Library library) {
        Book borrowedBook = library.removeBook(book);
        if (borrowedBook != null){
            this.card.add(borrowedBook);
        }
    }

    public void returnBook(Book book, Library library){
        int i = this.card.indexOf(book);
        if (i >= 0){
            if (library.addBook(book)){
                this.card.remove(i);
            }
        }
    }
}
