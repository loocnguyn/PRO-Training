/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mynam
 */
public class ElectricMotor {
    private String name;
    private int voltage;
    private int current;

    public ElectricMotor() {
    }

    public ElectricMotor(String name, int voltage, int current) {
        this.name = name;
        if(voltage>220 || voltage<110)
            this.voltage = 120;
        else
            this.voltage = voltage;
        if(current<=0)
            this.current = 1;
        else
            this.current = current;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        if(voltage >=110 && voltage<=220)
            this.voltage = voltage;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }
    public int getPower(){
        return voltage * current;
    }

    @Override
    public String toString() {
        return name.toUpperCase() + ", " + voltage + ", " + current + ", " + getPower();
    }
    
}
