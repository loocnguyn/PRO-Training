/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mynam
 */
public class Engineer extends Staff{
    private int benefits;

    public Engineer() {
    }

    public Engineer(int id, int salary, int benefits) {
        super(id, salary);
        this.benefits = benefits;
    }

    public int getBenefits() {
        return benefits;
    }

    public void setBenefits(int benefits) {
        this.benefits = benefits;
    }
    public int getGrossSalary(){
        int grossSalary;
        grossSalary = salary + benefits;
        return grossSalary;
    }

    @Override
    public String toString() {
        return super.getId() + ", " + salary + ", " + benefits + ", " + getGrossSalary();
    }
    
}
