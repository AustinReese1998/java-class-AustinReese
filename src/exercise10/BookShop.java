package exercise10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class BookShop
 * @author yasiro01
 */
public class BookShop {
  ArrayList<Book> catalog;

  public BookShop() {
      catalog = new ArrayList();
  }
  
  public BookShop(String filename) throws FileNotFoundException, IOException {
      catalog = new ArrayList();
      BufferedReader br = new BufferedReader (new FileReader(filename));
      String line = br.readLine();
      while (line != null){
          String[] lib = line.split(",");
          Book book = new Book(lib[0],lib[1],Double.parseDouble(lib[2]),Integer.parseInt(lib[3]));
          catalog.add(book);
          line = br.readLine();
      }
  }
  
  public BookShop(BookShop anotherBookShop) {
    this();
    for ( Book book : anotherBookShop.catalog){
        Book newBook = new Book(book.title, book.author, book.price, book.year);
        this.catalog.add(newBook);
        
    }
//    this.catalog = (ArrayList<Book>)anotherBookShop.catalog.clone();
  }
  
  public void addNewTitle(Book book) {
      catalog.add(book);
  }
  
  public int size() {
      return catalog.size();
  }
  
  public void discountAll(Double discountPercent) {
      catalog.forEach((item) -> {
          item.setPrice(item.getPrice() * (1-(discountPercent/100.0)));
      });
  }
  
  public void printCatalog() {
      catalog.forEach((item) -> {
          System.out.println(item);
      });
  }
  
  public void order(Comparator<Book> comp) {
    Collections.sort(catalog, comp);
  }
  
  public ArrayList<Book> getCatalog() {
      return catalog;
  }

}
