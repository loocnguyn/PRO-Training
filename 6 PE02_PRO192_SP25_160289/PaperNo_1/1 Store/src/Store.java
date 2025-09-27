/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mynam
 */
public class Store {
    private String name;
    private String location;
    private int inventoryCount;
    private int capacityLimit;

    public Store() {
    }

    public Store(String name, String location, int inventoryCount, int capacityLimit) {
        this.name = name;
        this.location = location;
        if(inventoryCount<50)
            this.inventoryCount = 50;
        else
            this.inventoryCount = inventoryCount;
        this.capacityLimit = capacityLimit;
    }

    public String getName() {
        if(name.length() >=5)
            return name.toUpperCase();
        else
            return "N/A";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getInventoryCount() {
        return inventoryCount;
    }

    public void setInventoryCount(int inventoryCount) {
        this.inventoryCount = inventoryCount;
    }

    public int getCapacityLimit() {
        if(capacityLimit < inventoryCount)
            capacityLimit = inventoryCount * 5;
        return capacityLimit;
    }

    public void setCapacityLimit(int capacityLimit) {
        this.capacityLimit = capacityLimit;
    }
    public int getAvailableCapacity(){
        if(capacityLimit < inventoryCount)
            capacityLimit = inventoryCount * 5;
        int availableCapacity;
        availableCapacity = capacityLimit - inventoryCount;
        return availableCapacity;
    }

    @Override
    public String toString() {
        return name + "-" + location + "-" + inventoryCount + "-" + getCapacityLimit();
    }
    
}
