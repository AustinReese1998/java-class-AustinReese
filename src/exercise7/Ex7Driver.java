/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

/**
 *
 * @author austinreese
 */
public class Ex7Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HourlyEmployee bob = new HourlyEmployee(12.50, 40);
        SalariedEmployee joe = new SalariedEmployee(245000);
        System.out.println(bob);
        System.out.println(joe);
        bob.setSsn("867-00-5309");
        bob.setName("Bobby");
        joe.setSsn("505-42-5005");
        joe.setName("Good ole' Joey");
        System.out.println(bob);
        System.out.println(joe);
        bob.printWeeklyCheck();
        joe.printWeeklyCheck();
    }
    
}
