package exercise5;

/**
 * Class Book
 * Task 2: Create a class Book with the following private data members: String title, String author, double price
 * @author reesau01
 */
public class Book {
    private String title;
    private String author;
    private double price;
    
 
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }

    public String getAuthor(){
        return author;
}
    public String toString() {
        return String.format("%s by %s costs %s", title, author, price);
}
}
