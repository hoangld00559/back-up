/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoomanagement;

/**
 *
 * @author MyPC
 */
public class Tiger extends Animal{

    @Override
    void tiengKeu() {
        System.out.println("hu hu");
    } 

    public Tiger() {
    }

    public Tiger(String ten) {
        super(ten);
    }

    public Tiger(String ten, int tuoi) {
        super(ten, tuoi);
    }

    public Tiger(String ten, int tuoi, String moTa) {
        super(ten, tuoi, moTa);
    }
    
}
