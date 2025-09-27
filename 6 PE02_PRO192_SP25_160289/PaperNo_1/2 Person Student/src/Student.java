/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mynam
 */
public class Student extends Person{
    private int gpa;

    public Student() {
    }

    public Student(String id, String name, String email, int gpa) {
        super(id, name, email);
        if(gpa < 0 || gpa > 100)
            this.gpa = 0;
        else
            this.gpa = gpa;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        if(gpa < 0 || gpa > 100)
            this.gpa = 0;
        else
            this.gpa = gpa;
    }
    public double getReward(){
        double reward =0;
        double P;
        P = gpa/100.0;
        if(gpa >=70 && gpa<80)
            reward = 7000 * P;
        else if(gpa >=80 && gpa<90)
            reward = 8000 * P;
        else if(gpa >=90 && gpa<100)
            reward = 9000 * P;
        return reward;
    }

    @Override
    public String toString() {
        return getId() + ", " + getName().toUpperCase() + ", " + getEmail() + ", " + getReward();
    }
    
}
