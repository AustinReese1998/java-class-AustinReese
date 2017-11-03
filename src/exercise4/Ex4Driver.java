package exercise4;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Austin Reese (reesau01)
 */
public class Ex4Driver {

   public static void main(String[] args) {
       
       System.out.println(task1(10));
       System.out.println(task2("Java is rad"));
       System.out.println(task3('a'));
       System.out.println(task4("Don't Panic"));
       System.out.println(task5(10, 10));
       System.out.println(task6("Helter Skelter", 13));
       Integer [] intArr = {1,2,3,4,5,6,7,8,9};
       System.out.println(task7(intArr));
       System.out.println(task8(intArr,10));
       ArrayList<String> strList = new ArrayList<>(Arrays.asList("wow", "wow", "wow"));
       System.out.println(task9(strList));
       HashMap<String, Integer> hasher = new HashMap();
       hasher.put("johnny", 1);
       hasher.put("sue", 2);
       hasher.put("carl", 3);
       hasher.put("liz", 4);
       System.out.println(task10(hasher));
       
       
       
   }
  /*
  Define a function that takes 1 integer as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
    */
    public static Integer task1(Integer n){
       //task1 will square n
       System.out.println("---task 1---");
       return n*n;
    }
    /*
Define a function that takes 1 string as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
    */
    public static Integer task2(String foo){
        //task2 will return the length of a string
        System.out.println("---task 2---");
        return foo.length();
}
    /*
Define a function that takes 1 character as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
    */
    public static Integer task3(Character c){
        //task3 will return the ascii value of a character
        System.out.println("---task 3---");
        int ascii = (int) c;
        return ascii;
    }
    /*
Define a function that takes 1 string as a parameter and returns a character. Write 2 unit tests to verify the function validity.
    */
    public static Character task4(String foo){
        //task4 will return the final character in the string
        System.out.println("---task 4---");
        Character chr = foo.charAt(foo.length()-1);
        return chr;
    }
    /*
Define a function that takes 2 integers as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
    */
    public static Integer task5(Integer i, Integer j){
        //task5 will multilply the two integers
        System.out.println("---task 5---");
        return i * j;
    }
    /*
Define a function that takes a string and an integer as parameters and returns a Character. Write 2 unit tests to verify the function validity.
    */
    public static Character task6(String foo, Integer i){
        //task6 will return the character at the integers position in the string
        System.out.println("---task 6---");
        Character chr = (Character) foo.charAt(i % foo.length());
        return chr;
    }
    /*
Define a function that takes an array of integers as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
    */
    public static Integer task7(Integer[] intArr){
        //task7 will return the middle value in the array
        System.out.println("---task 7---");
        int i = intArr[intArr.length / 2];
        return i;
    }
    /*
Define a function that takes an array of integers and an integer as parameters and returns a boolean. Write 2 unit tests to verify the function validity.
    */
    public static Boolean task8(Integer[] intArr, Integer j){
        //task8 will return whether or not the integer is in the array
        System.out.println("---task 8---");
        boolean contains = false;
        for (int i=0; i<intArr.length;++i){
            if (intArr[i] == j){
                contains = true;
            }
        }
        return contains;
    }
    /*
Define a function that takes an ArrayList of Strings as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
    */
    public static Integer task9(ArrayList<String> strList){
        //task9 returns the length of the ArrayList
        System.out.println("---task 9---");
        return strList.size();
    }
    /*
Define a function that takes a HashMap (exact details are up to you) as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
    */
    public static Integer task10(HashMap<String, Integer> hasher){
    //task10 returns the integer value of "johnny"
    System.out.println("---task 10---");
    return hasher.get("johnny");
}
}
