/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mynam
 */
public class Professor extends Employee{
    private String department;

    public Professor() {
    }

    public Professor(int id, String name, double standardSalary, String department) {
        super(id, name, standardSalary);
        this.department = department;
    }

    public String getDepartment() {
        return department.toUpperCase();
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public double calculateActualSalary(){
        double actualSalary;
        double K = 1.0;
        if(department.equalsIgnoreCase("gd"))
                K = 1.5;
        else if(department.equalsIgnoreCase("it"))
                K = 2.0;
        actualSalary = getStandardSalary() * K;
        return actualSalary;
    }

    @Override
    public String toString() {
        return getId() + ", " + getName().toUpperCase() + ", " + getDepartment().toUpperCase() + ", " + String.format("%.2f", calculateActualSalary());
    }
    
}
