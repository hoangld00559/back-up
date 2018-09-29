/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author MyPC
 */
public class SwitchButton {
    private boolean status;
    private ElectricLamp lamp;
    
    public void connectToLamp(ElectricLamp lamp){
        this.lamp = lamp;
    }
    
    public void swichOff(){
        this.status = false;
        lamp.turnOff();
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    public void switchOn(){
        this.status = true;
        lamp.turnOn();
    }

    
}
