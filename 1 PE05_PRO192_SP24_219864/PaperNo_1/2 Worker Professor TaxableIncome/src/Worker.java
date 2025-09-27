/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mynam
 */
public abstract class Worker {
    protected String name;
    protected int age;
    protected int numberOfChild;

    public Worker() {
    }

    public Worker(String name, int age, int numberOfChild) {
        this.name = name;
        this.age = age;
        this.numberOfChild = numberOfChild;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfChild() {
        return numberOfChild;
    }

    public void setNumberOfChild(int numberOfChild) {
        this.numberOfChild = numberOfChild;
    }
    public abstract double getGrossIncome();
    public abstract double getTax(double salary);
}
