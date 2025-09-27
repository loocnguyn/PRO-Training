/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mynam
 */
public class Ostrich {
    private String name;
    private int weight;
    private int step;

    public Ostrich() {
    }

    public Ostrich(String name, int weight) {
        this.name = name;
        if(weight <=0)
            weight = 1;
        else
            this.weight = weight;
        if(weight >=1  && weight <= 10)
            this.step = 5;
        else if(weight > 10)
            this.step = weight + 5;
    }

    public String getName() {
        return name.toLowerCase();
    }

    public int getWeight() {
        return weight;
    }

    public int getStep() {
        return step;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        if(weight >=1  && weight <= 10)
            this.step = 5;
        else if(weight > 10)
            this.step = weight + 5;
    }

    public void setStep(int step) {
        this.step = step;
    }

    @Override
    public String toString() {
        return name + ", " + weight + ", " + step;
    }
    
}
