/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mynam
 */
public class Promotion {
    private int id;
    private String name;
    private double discountPercentage;

    public Promotion() {
    }

    public Promotion(int id, String name, double discountPercentage) {
        this.id = id;
        this.name = name;
        this.discountPercentage = discountPercentage;
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

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + String.format("%,2f", discountPercentage);
    }
    
}
