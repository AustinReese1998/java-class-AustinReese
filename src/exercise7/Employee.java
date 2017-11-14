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
public class Employee {
    private String name;
    private String ssn;

    public Employee() {}
    
    
    public Employee(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }
    
    @Override
    public String toString() {
        return name + " with SSN of " + ssn;
    }
}
