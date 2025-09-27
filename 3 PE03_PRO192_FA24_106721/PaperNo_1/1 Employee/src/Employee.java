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
    private double salary;
    private int seniority;

    public Employee() {
    }

    public Employee(int id, String name, double salary, int seniority) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.seniority = seniority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        if(seniority <= 0)
            this.seniority =1;
        else
            this.seniority = seniority;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary) + ", " + seniority;
    }
    public void updateSalary(){
        if(this.seniority>=3 && this.seniority<=5)
            salary = salary * 130/100;
        else if(this.seniority>=6 && this.seniority<=10)
            salary = salary * 150/100;
        else if(this.seniority > 10)
            salary = salary * 200/100;
    }
}
