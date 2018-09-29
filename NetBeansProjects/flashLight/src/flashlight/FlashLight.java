/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flashlight;

/**
 *
 * @author MyPC
 */
public class FlashLight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Battery Abc = new Battery();
        Abc.getEnergy();
        FlashLamp Xyz = new FlashLamp();
        Xyz.turnOn();
        System.out.println(Xyz.getBattetyInfo());
        
    }

}
