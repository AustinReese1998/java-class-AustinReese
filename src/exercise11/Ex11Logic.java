package exercise11;

import java.util.Collection;
import java.util.Collections;

/**
 * Exercise 11 logic
 * @author yasiro01
 */
public class Ex11Logic {
  
  /**
   * Task 1
   * @param <T>
   * @param item
   * @return length of the parameter's string representation
   */
  // TODO: Implement method strLen
  public <T> int strLen(T item){
      String strItem = item.toString();
      return strItem.length();
  }
  /**
   * Task 2
   * @param <T>
   * @param item1
   * @param item2
   * @param item3
   * @return the greater of three parameters
   */
  // TODO: Implement method greater
  public <T extends Comparable> T greater(T item1, T item2, T item3) {
    if (item1.compareTo(item2) >= 0) {
        if (item1.compareTo(item3) >= 0){
            return item1;
        }
    }   else if (item2.compareTo(item3) >= 0) {
            return item2;
    } else {
      return item3;
    }
    return item1;
  }
  /**
   * Task 3
   * @param <T>
   * @param list of objects
   * print a list of items
   */
  // TODO: Implement method printList
  public <T> void printList(T ... list) {
    for (T item: list) {
      System.out.print(item + " ");
    }
  }
  /**
   * Task 4
   * @param <T>
   * @param list of objects
   * @return the smallest item in the collection
   */
  // TODO: Implement method findMinItem

  public <T extends Comparable> T findMinItem(Collection<T> list){
      T minItem = null;
      for (T item: list){
          if (minItem == null){
              minItem = item;
          } else if (item.compareTo(minItem) < 0){
              minItem = item;
          }
          
      }
      return minItem;
      }


      
  /**
   * Task 5
   * @param <T>
   * @param <U>
   * A class with two data members, T fuzz and U buzz
   * Implement the constructor, getters, setters, and toString
   */
  // TODO: Implement class Foo
  public class Foo<T,U>{
      private T fuzz;
      private U buzz;

        public Foo(T fuzz, U buzz) {
            this.fuzz = fuzz;
            this.buzz = buzz;
        }

        public T getFuzz() {
            return fuzz;
        }

        public U getBuzz() {
            return buzz;
        }

        public void setFuzz(T fuzz) {
            this.fuzz = fuzz;
        }

        public void setBuzz(U buzz) {
            this.buzz = buzz;
        }

        @Override
        public String toString() {
            return "Foo{" + "fuzz=" + fuzz + ", buzz=" + buzz + '}';
        }
      
      
  }
}