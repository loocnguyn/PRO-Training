/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TQMinh
 */
public class Item {
    private String name;
    private int quantity;
    private String status;

    public Item() {
    }

    public Item(String name, int quantity) {
        this.name = name;
        if(quantity < 0){
            this.quantity = 0;
            this.status = "N/A";
        }

        else{
            this.quantity = quantity;
            this.status = "A";
        }

    }

    public String getName() {
        return name.toUpperCase();
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity < 0){
            this.quantity = 0;
            this.status = "N/A";
        }

        else{
            this.quantity = quantity;
            this.status = "A";
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return name.toUpperCase() + ", " + quantity + ", " + getStatus();
    }
    
}
