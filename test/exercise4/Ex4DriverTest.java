/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author austinreese
 */
public class Ex4DriverTest {
    
    public Ex4DriverTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of task1 method, of class Ex4Driver.
     */
    @Test
    public void testTask1() {
        System.out.println("task1");
        Integer n = 3;
        Integer expResult = 9;
        Integer result = Ex4Driver.task1(n);
        assertEquals(expResult, result);
        n = 5;
        expResult = 25;
        result = Ex4Driver.task1(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of task2 method, of class Ex4Driver.
     */
    @Test
    public void testTask2() {
        System.out.println("task2");
        String str = "bob";
        Integer expResult = 3;
        Integer result = Ex4Driver.task2(str);
        assertEquals(expResult, result);
        str = "larry";
        expResult = 5;
        result = Ex4Driver.task2(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of task3 method, of class Ex4Driver.
     */
    @Test
    public void testTask3() {
        System.out.println("task3");
        Character c = 'O';
        Integer expResult = 79;
        Integer result = Ex4Driver.task3(c);
        assertEquals(expResult, result);
        c = 'o';
        expResult = 111;
        result = Ex4Driver.task3(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of task4 method, of class Ex4Driver.
     */
    @Test
    public void testTask4() {
        System.out.println("task4");
        String str = "bob dylan";
        Character expResult = 'n';
        Character result = Ex4Driver.task4(str);
        assertEquals(expResult, result);
        str = "john lennon";
        expResult = 'n';
        result = Ex4Driver.task4(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of task5 method, of class Ex4Driver.
     */
    @Test
    public void testTask5() {
        System.out.println("task5");
        Integer i = 3;
        Integer j = 3;
        Integer expResult = 9;
        Integer result = Ex4Driver.task5(i,j);
        assertEquals(expResult, result);
        i = 5;
        j = 10;
        expResult = 50;
        result = Ex4Driver.task5(i,j);
        assertEquals(expResult, result);
    }

    /**
     * Test of task6 method, of class Ex4Driver.
     */
    @Test
    public void testTask6() {
        System.out.println("task6");
        String foo = "bogus";
        Integer i = 2;
        Character expResult = 'g';
        Character result = Ex4Driver.task6(foo, i);
        assertEquals(expResult, result);
        foo = "round the bend";
        i = 11;
        expResult = 'e';
        result = Ex4Driver.task6(foo, i);
        assertEquals(expResult, result);
    }

    /**
     * Test of task7 method, of class Ex4Driver.
     */
    @Test
    public void testTask7() {
        System.out.println("task7");
        Integer[] intArr = {1,2,3};
        Integer expResult = 2;
        Integer result = Ex4Driver.task7(intArr);
        assertEquals(expResult, result);
        Integer[] intArr2 = {4,5,6,7,8};
        expResult = 6;
        result = Ex4Driver.task7(intArr2);
        assertEquals(expResult,result);
        
    }
    /**
     * Test of task8 method, of class Ex4Driver.
     */
    @Test
    public void testTask8() {
        System.out.println("task8");
        Integer[] intArr = {1,2,3};
        Integer j = 3;
        boolean expResult = true;
        boolean result = Ex4Driver.task8(intArr, j);
        assertEquals(expResult, result);
        j = 0;
        expResult = false;
        result = Ex4Driver.task8(intArr, j);
        assertEquals(expResult,result);
    }

    /**
     * Test of task9 method, of class Ex4Driver.
     */
    @Test
    public void testTask9() {
        System.out.println("task9");
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("should","I","stay","or","should","I","go","?"));
        Integer expResult = 8;
        Integer result = Ex4Driver.task9(strList);
        assertEquals(expResult, result);
        ArrayList<String> strList2 = new ArrayList<>(Arrays.asList("down","in","jungleland"));
        expResult = 3;
        result = Ex4Driver.task9(strList2);
        assertEquals(expResult,result);
    }

    /**
     * Test of task10 method, of class Ex4Driver.
     */
    @Test
    public void testTask10() {
        System.out.println("task10");
        HashMap<String, Integer> hasher = new HashMap();
        hasher.put("paul", 1);
        hasher.put("george", 2);
        hasher.put("ringo", 3);
        hasher.put("john", 4);
        hasher.put("johnny",99);
        Integer expResult = 99;
        Integer result = Ex4Driver.task10(hasher);
        assertEquals(expResult, result);
        HashMap<String, Integer> hasherier = new HashMap();
        hasherier.put("paul", 1);
        hasherier.put("george", 2);
        hasherier.put("johnny", 3);
        hasherier.put("john", 4);
        hasherier.put("ringo",99);
        expResult = 3;
        result = Ex4Driver.task10(hasherier);
        assertEquals(expResult, result);
    }
    
}
