/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mynam
 */
public class Employee {
    private int id;
    private String name;
    private double standardSalary;

    public Employee() {
    }

    public Employee(int id, String name, double standardSalary) {
        this.id = id;
        this.name = name;
        this.standardSalary = standardSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name.toUpperCase();
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStandardSalary() {
        return standardSalary;
    }

    public void setStandardSalary(double standardSalary) {
        this.standardSalary = standardSalary;
    }
    
    
}
