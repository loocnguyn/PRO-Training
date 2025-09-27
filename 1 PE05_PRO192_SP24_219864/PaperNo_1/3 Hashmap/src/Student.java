/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mynam
 */
public class Student {
    private String rollNo;
    private String name;
    private  float gpa;

    public Student() {
    }

    public Student(String rollNo, String name, float gpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.gpa = gpa;
    }

    public String getRollNo() {
        return rollNo.toUpperCase();
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return rollNo.toUpperCase() + "-" +  name + "-" + String.format("%.2f", gpa);
    }
    
}
