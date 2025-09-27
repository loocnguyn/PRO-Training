/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mynam
 */
public class Staff {
    private int id;
    int salary;

    public Staff() {
    }

    public Staff(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary<1000)
            this.salary = 1000;
        else
            this.salary = salary;
    }

    @Override
    public String toString() {
        return id + ", " + salary;
    }
    
}
