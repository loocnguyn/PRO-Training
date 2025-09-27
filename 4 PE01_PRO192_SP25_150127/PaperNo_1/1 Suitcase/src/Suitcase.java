/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mynam
 */
public class Suitcase {
    private int id;
    private String name;
    private double capacity;
    private int maxWeight;

    public Suitcase() {
    }

    public Suitcase(int id, String name, double capacity, int maxWeight) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.maxWeight = maxWeight;
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

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    public double expandSuitcase(){
        double nc;
        if(maxWeight >=15)
            nc = capacity + 5;
        else if(maxWeight>7 && maxWeight <15)
            nc = capacity + 2;
        else
            nc = capacity;
        return nc;
    }

    @Override
    public String toString() {
        return id + ", " + name.toUpperCase() + ", " + String.format("%.2f", capacity) + ", " + maxWeight;
    }
    
}
