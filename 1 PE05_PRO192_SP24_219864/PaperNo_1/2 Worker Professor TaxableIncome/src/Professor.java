/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mynam
 */
public class Professor extends Worker{
    private int tenure;

    public Professor() {
    }

    public Professor(int tenure,  int numberOfChild, String name, int age) {
        super(name, age, numberOfChild);
        this.tenure = tenure;
    }

    @Override
    public String toString() {
        return name + ", " + age + ", " + numberOfChild + ", " + tenure;
    }

    @Override
    public double getGrossIncome() {
        double grossIncome = 0;
        if(tenure >=1 && tenure <=3)
            grossIncome = 3000;
        else if(tenure >3)
            grossIncome = 5000;
        return grossIncome;
    }

    @Override
    public double getTax(double salary) {
        double tax = 0;
        double deduction; 
        deduction = numberOfChild * 900.0;
        double taxableIncome;
        taxableIncome = salary - deduction;
        if(taxableIncome <=1000 )
            tax = 0.1* taxableIncome;
        else if(taxableIncome > 1000)
            tax = 0.2 * taxableIncome;
        return tax;
    }
    
}
