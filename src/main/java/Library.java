import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> stock;
    private int capacity;

    public Library(String name, int capacity){
        this.name = name;
        this.stock = new ArrayList<>();
        this.capacity = capacity;
    }

    public String getName(){
        return this.name;
    }

    public int checkStock(){
        return this.stock.size();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void addBook(Book book){
        if (checkStock() < getCapacity()){
            this.stock.add(book);
        }
    }

    public void removeBook(Book book){
        this.stock.remove(book);
    }
}
