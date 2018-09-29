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
public class Cat extends Animal{

    @Override
    void tiengKeu() {
        System.out.println("meo meo");
    }

    public Cat() {
    }

    public Cat(String ten) {
        super(ten);
    }

    public Cat(String ten, int tuoi) {
        super(ten, tuoi);
    }

    public Cat(String ten, int tuoi, String moTa) {
        super(ten, tuoi, moTa);
    }
    
}
