/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mynam
 */
public class Truck extends Vehicle{
    private double cargoCapacity;

    public Truck() {
    }

    public Truck(String model, String fuelType, double fuelEfficiency, double cargoCapacity) {
        super(model, fuelType, fuelEfficiency);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public double calculateFuelEfficiency() {
        double F;
        F =this.getFuelEfficiency() * (1.0/(1.0+(cargoCapacity/1000.0)));
        return F;
    }

    @Override
    public double calculateDistanceTraveled() {
        double D;
        D = calculateFuelEfficiency() * this.getFuelEfficiency();
        return D;
    }

    @Override
    public String toString() {
        return this.getModel() + ", " + this.getFuelType() + ", " + String.format("%.2f", this.getFuelEfficiency()) +", " + String.format("%.2f", this.getCargoCapacity());
    }
    
}
