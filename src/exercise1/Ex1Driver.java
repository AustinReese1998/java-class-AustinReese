package exercise1;

import java.util.Scanner;
import java.util.Random;

/**
 * @author reesau01 (AUstin Reese)
 * @assignment Week1: Exercise 1
 */
public class Ex1Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numbers = new int[10];
    for (int i = 0; i < 10; i++) {
      numbers[i] = rnd.nextInt(10);
    }
    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8(numbers);
    task9();
    task10();
  }

  /**
   * TODO: Task 1: Print "Hello World" to the default system output
   */
  public static void task1() {
    System.out.println("---Task 1---");
    System.out.println("Hello World");
    System.out.println();
  }
  /**
   * TODO: Task 2: Print all numbers between 1 and 100 (inclusive) replacing all multiples of 3 with "foo", multiples of 5 with "bar", multiples of 3 and 5 with "huh"
   */
  public static void task2() {
    System.out.println("---Task 2---");
    for (int i = 1; i<=100; ++i){
        if ( (i % 3) == 0 && (i % 5) == 0){
            System.out.println("huh");
        }   else if ((i % 3) == 0){
            System.out.println("foo");
        }   else if ((i % 5) == 0){
            System.out.println("bar");
        }   else {
            System.out.println(i);   
        }
    };
    System.out.println();
  }
  /**
   * TODO: Task 3: Calculate and print the sum of all multiples of 7 between 1 and 100 (inclusive)
   */
  public static void task3() {
    System.out.println("--Task 3--");
    int ans = 0;
    for (int i = 1; i<=100; ++i){
        if ((i % 7) == 0){
            ans = ans + i;
        }
    }
    System.out.printf("The sum of all multiples of 7 between 1 and 100 is %-5d%n", ans);
    System.out.println();
  }
  /**
   * TODO: Task 4: Calculate and print sum and product of all numbers between 1 and 20 (inclusive)
   */
  public static void task4() {
    System.out.println("---Task 4---:");
    int sum = 0;
    long product = 0;
    for (int i = 1; i<=20; ++i){
        sum = sum + i;
        if (i == 1){
            product = 1;
        } else {
            product = product * i;
        }
    }
    System.out.printf("The sum of all numbers between 1 and 20 is %-20d%n",sum);
    System.out.printf("The product of all numbers between 1 and 20 is %-30d%n",product);
    System.out.println();
  }
  /**
   * TODO: Task 5: Ask a user to enter their full name and print the initials (ie John Q Doe should yield JQD)
   */
  public static void task5() {
    System.out.println("---Task 5---");
    String abbv = "";
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your full name");
    String name = scan.nextLine();
    abbv = abbv + name.charAt(0);
    for (int i = 0; i <= name.length() - 1; ++i){
        if (name.charAt(i) == ' '){
            abbv = abbv + name.charAt(i+1);
        }
    }

    abbv = abbv.toUpperCase();
    System.out.printf("Your initials are %s%n",abbv);
    System.out.println();
    
  }
  /**
   * TODO: Task 6: Create an array of 10 elements and initiate each element in it to the cube of its index (Do it in a loop, not during declaration)
   */
  public static void task6() {
    System.out.println("---Task 6---");
    int array_size = 10;
    int[] numbers = new int[array_size];
    for (int i = 0; i <= 9; ++i){
        numbers[i] = (i * i * i);
        System.out.print(" " + numbers[i]);
    }
    System.out.println();
    System.out.println();
  }
  /**
   * TODO: Task 7: Create an array of 100 random integers between 1 and 100, ask the user for an integer and tell if that number is in the array
   */
  public static void task7() {
    System.out.println("---Task 7---");
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] randNums = new int[100];
    for (int i = 0; i <= 99; ++i){
        randNums[i] = rnd.nextInt(100) + 1;
    }
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number");
    String strGuess = scan.nextLine();
    int guess = Integer.parseInt(strGuess);
    boolean found = false;
    for (int i=0;i<=99;++i){
        if (guess == randNums[i]){
            found = true;
            
        }
    }
    if (found == true){
        System.out.printf("%-3d was found in the array!%n",guess);
    }   else{
        System.out.printf("%-3d was NOT found in the array!%n",guess);
    }
    System.out.println();
  }
  /**
   * TODO: Task 8: Take an array of integers as a parameter, calculate, print, and return the sum of its elements
   * @param numbers
   * @return 
   */
  public static int task8(int[] numbers) {
      System.out.println("---Task 8---");
      int sum = 0;
      for (int i = 0; i <= numbers.length - 1; ++i){
          sum = sum + numbers[i];
      }
      System.out.print("Sum of all items in [");
      for (int i = 0; i <= numbers.length - 1; ++i){
          System.out.print(numbers[i] + " "); }
      System.out.print("] is " + sum);
      System.out.println();
      System.out.println();
      return sum;
  }
  /**
   * TODO: Task 9: Ask a user to enter a word and write a function that tells if letters of a word are ordered (ie. "buy" would return true, while "bye" - false).
   * @return 
   */
  public static boolean task9() {
    System.out.println("---Task 9---");
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a word");
    String word = scan.nextLine();
    boolean result = true;
    for (int i = 0; i <= word.length() - 1; ++i){
        if (i == word.length() - 1){
            String foo = "Good";
        }   else if (word.charAt(i) <= word.charAt(i+1)){
            String bar = "Grand";
        }   else{
            System.out.printf("Letters of " + word + " are NOT in order! Mayday!%n");
            return false;
        }
    }
    System.out.printf("Letters of " + word + " are in order, cheers!%n");
    return result;
  }
  /**
   * TODO: Task 10: Implement sieve of Eratosthenes and print all prime numbers between 1 and 100
   */
  public static void task10() {
      System.out.println();
      System.out.println("---Task 10---");
      System.out.println("Prime numbers between 1 and 100:");
      int n = 100;
       boolean[] primes = new boolean[n + 1];
       for (int i = 2; i < primes.length; i++) {
           primes[i] = true;
       }
       int num = 2;
       while (true) {
           for (int i = 2;; i++) {
               int multiple = num * i;
               if (multiple > n) {
                   break;
               } else {
                   primes[multiple] = false;
               }
           }
           boolean nextNumFound = false;
           for (int i = num + 1; i < n + 1; i++) {
               if (primes[i]) {
                   num = i;
                   nextNumFound = true;
                   break;
               }
           }
           if (!nextNumFound) {
               break;
           }
       }
       for (int i = 0; i < primes.length; i++) {
           if (primes[i]) {
               System.out.print(i + " ");
           }
  }

}
}
