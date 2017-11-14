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
public class SalariedEmployee extends Employee{
    private double salary;

    public SalariedEmployee(double salary, String name, String ssn) {
        super(name, ssn);
        this.salary = salary;
    }

    public SalariedEmployee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void printWeeklyCheck() {
        System.out.println(this.getName() + " earned a solid $" + this.getNetPay() + " this week.");
    }
    
    public double getNetPay() {
        return Math.round ( salary/52 );
    }
    
    @Override
    public String toString() {
        return super.toString() + " earns a delightful annual salary of $" + salary + ".";
    }
}
