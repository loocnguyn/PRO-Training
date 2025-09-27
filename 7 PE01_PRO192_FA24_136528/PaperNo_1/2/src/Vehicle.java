/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mynam
 */
public abstract class Vehicle{
    private String model;
    private String fuelType;
    private double fuelEfficiency;

    public Vehicle() {
    }

    public Vehicle(String model, String fuelType, double fuelEfficiency) {
        this.model = model;
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getModel() {
        return model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }
    public abstract double calculateFuelEfficiency();
    public abstract double calculateDistanceTraveled();       
}
