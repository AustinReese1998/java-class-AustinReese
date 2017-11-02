package exercise2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Hashtable;
import java.util.Scanner;
/**
 * @author reesau01 (Austin Reese)
 * @assignment Exercise 2
 */
public class Ex2Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numberArr = new int[10];
    for (int i = 0; i < 10; i++) {
      numberArr[i] = rnd.nextInt(100);
    }
    ArrayList<Integer> numberLst = new ArrayList();
    for (int i = 0; i < 10; i++) {
      numberLst.add(rnd.nextInt(100));
    }
    task1(3);
    System.out.println(task2(numberArr, 90));
    System.out.println(task3(numberArr, 75));
    task4(numberArr);
    task5(numberArr);
    task6();
    task7();
    System.out.println(task8(numberLst, 75));
    task9();
    task10(task9());
  }

  /**
   * TODO: Task 1: Define and call a function that takes a number (n) as a parameter and prints the result of coin flips ("Heads" or "Tails" with equal probability) until there are n "Heads" in a row.
   * @param n
   */
  public static void nHeads(int n) {
      Random rnd = new Random();
      ArrayList<Integer> log = new ArrayList<Integer>();
      boolean done = false;
      Hashtable<Integer, String> htd = new Hashtable();
      htd.put(0, "Tails");
      htd.put(1, "Heads");
      while(!done) {
          int result = 0;
          int ht = rnd.nextInt(2);
          System.out.println(htd.get(ht));
          log.add(ht);
          if (log.size() >= n) {
              for (int i = 0; i < n; i++){
                result = result + log.get(log.size()- i - 1);
                    if (result >= n){
                        done = true;
                    }
              }
          }
     }
  }
  public static void task1(int n) {
    System.out.println("---Task 1---");
     nHeads(n);
  }
  /**
   * TODO: Task 2: Define a function that takes an array of integers and a number as parameters and returns boolean True if the number provided is larger than every element of the array, False otherwise.
   * @param arr
   * @param n
   * @return 
   */
  public static boolean task2(int[] arr, int n) {
    System.out.println();
    System.out.println("---Task 8---");
    int[][] table = new int[11][11];
    for (int i=1;i<table.length;++i){
        for (int j=1;j<table[0].length;++j){
            table[i][j] = i*j;
            System.out.printf("%5s", table[i][j]);
        }
        System.out.println();
    }
    System.out.println("---Task 2---");     for (int i = 0; i < arr.length; i++){
         System.out.println(arr[i]);
         if (arr[i] >= n){
             return false;
         }
     }    
    System.out.println();
    return true;
  }
  /**
   * TODO: Task 3: Write a function that takes an array of integers and a threshold and prints how many values are below the threshold.
   * @param arr
   * @param threshold
   * @return 
   */
  public static int task3(int[] arr, int threshold) {
    System.out.println();
    System.out.println("---Task 8---");
    int[][] table = new int[11][11];
    for (int i=1;i<table.length;++i){
        for (int j=1;j<table[0].length;++j){
            table[i][j] = i*j;
            System.out.printf("%5s", table[i][j]);
        }
        System.out.println();
    }
    System.out.println("---Task 3---");
     int belowThresh = 0;
     for (int i = 0; i < arr.length; i++){
         if (arr[i] <= threshold){
             belowThresh++;
         }
     }
     return belowThresh;
  }
  /**
   * TODO: Task 4: Write a function that takes an array of integers as a parameter, finds the difference between 100 and the largest element of the array and adds this difference to every element in the array. (Note: after this function call the largest value in the array must be 100.)
   * @param arr
   */
  public static void task4(int[] arr) {
    System.out.println();
    System.out.println("---Task 4---");
     int large = 0;
     System.out.println("Before");
     for (int i = 0; i < arr.length; i++){
         System.out.println(arr[i]);
         if (arr[i] > large){
             large = arr[i];
         }
     }
     System.out.println("After");
     int diff = 100 - large;
     for (int i=0;i<arr.length;++i){
         arr[i] = arr[i] + diff;
          System.out.println(arr[i]);
     }
    System.out.println();
  }
  /**
   * TODO: Task 5: Write a function that takes an array of integers as a parameter and, assuming the values are scores, prints number of students with 'A', 'B', 'C', 'D' and 'F'.
   * @param arr
   */
  public static void task5(int[] arr) {
    System.out.println("---Task 5---");
      int a = 0;
      int b = 0;
      int c = 0;
      int d = 0;
      int f = 0;
      for (int i=0;i<arr.length;++i){
          if (arr[i] >= 90){
              ++a;
          } else if (arr[i] >= 80){
              ++b;
          } else if (arr[i] >= 70){
              ++c;
          } else if (arr[i] >= 60){
              ++d;
          } else {
              ++f;
          }
      }
      System.out.printf("A students:%-2d B students:%-2d C students:%-2d D students:%-2d F students:%-2d%n",a,b,c,d,f);
  
    System.out.println();
  }
  /**
   * TODO: Task 6: Create an ArrayList of double values and ask a user to start entering numbers. Keep asking and adding numbers to the ArrayList until the user enters 0, then stop and print all the values in the ArrayList. Use function add() to add a number to an ArrayList.
   */
  public static void task6() {
    System.out.println("---Task 6---");
    ArrayList<Double> arr = new ArrayList();
    boolean quit = false;
    while (!quit){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter a number (or 0 to quit)%n");
        double num = scan.nextDouble();
        if (num == 0){
            quit = true;
            System.out.println(arr);
        } else{
            arr.add(num);
        }
    }
    System.out.println();
  }
  /**
   * TODO: Task 7: Create an ArrayList of integer values of size 10 and initialize each element of the ArrayList to a random number between 50 and 100.
   */
  public static void task7() {
    System.out.println("---Task 7---");
    ArrayList<Integer> arr = new ArrayList<Integer>(10);
    Random rnd = new Random();
    for (int i=0;i<10;++i){
        arr.add(rnd.nextInt(51)+50);
    }
    System.out.println(arr);
    System.out.println();
  }
  /**
   * TODO: Task 8: Define a function that takes an ArrayList of integer values and a threshold as parameters and returns the number of values in the ArrayList below a threshold. You may use the ArrayList created at the previous step.
   * @param arrLst
   * @param threshold
   * @return 
   */
  public static int task8(ArrayList<Integer> arrLst, int threshold) {
    System.out.println("---Task 8---");
    int belowThresh = 0;
    for (int i = 0; i < arrLst.size(); i++){
        if (arrLst.get(i) <= threshold){
            belowThresh++;
         }
     }
     return belowThresh;
  }
  /**
   * TODO: Task 9: Generate a 2-dimensional array of size 10x10. Initialize values in the array to the values in the multiplication table of size 10. (e.g. values in the intersections must start with 1 (1x1) and go all the way up to 100). Print the array and return it.
   * @return 
   */
  public static int[][] task9() {
    System.out.println();
    System.out.println("---Task 9---");
    int[][] table = new int[11][11];
    for (int i=1;i<table.length;++i){
        for (int j=1;j<table[0].length;++j){
            table[i][j] = i*j;
            System.out.printf("%5s", table[i][j]);
        }
        System.out.println();
    }
    return table;
  }
  /**
   * TODO: Task 10: Calculate and print the sum of values in each row and each column of the matrix generated at the previous step.
   * @param matrix
   */
  public static void task10(int[][] table) {
    System.out.println();
    System.out.println("---Task 10---");
    for (int i=1;i<table.length;++i){
        int sumRow = 0;
        for (int j=1;j<table[0].length;++j){
            sumRow = sumRow + table[i][j];
        }            
        System.out.println(sumRow);
        System.out.println();
    }
  }

}
