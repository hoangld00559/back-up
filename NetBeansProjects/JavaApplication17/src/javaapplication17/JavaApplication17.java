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
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ElectricLamp lamp = new ElectricLamp();
        
        SwitchButton switchButton = new SwitchButton();
        
        switchButton.connectToLamp(lamp);
        
        switchButton.switchOn();
        System.out.println(switchButton.getStatus());
        
        switchButton.swichOff();
        System.out.println(switchButton.getStatus());
    }
    
}
