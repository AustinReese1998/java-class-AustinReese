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
public class HourlyEmployee extends Employee {
    private double wageRate;
    private double hours;

    public HourlyEmployee(double wageRate, double hours, String name, String ssn) {
        super(name, ssn);
        this.wageRate = wageRate;
        this.hours = hours;
    }

    public HourlyEmployee(double wageRate, double hours) {
        this.wageRate = wageRate;
        this.hours = hours;
    }

    public double getWageRate() {
        return wageRate;
    }

    public double getHours() {
        return hours;
    }

    public void setWageRate(double wageRate) {
        this.wageRate = wageRate;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    
    public void printWeeklyCheck() {
        System.out.println(this.getName() + " earned a pathetic $" + this.getNetPay() + " this week.");
    }
    
    public double getNetPay() {
        return Math.round( hours*wageRate);
    }
    
    @Override
    public String toString() {
        return super.toString() + " earns a pitiful hourly wage of $" + wageRate + " while working " + hours + " hours per week.";
    }
}
    

