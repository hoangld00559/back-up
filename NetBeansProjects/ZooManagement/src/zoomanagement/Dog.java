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
public class Dog extends Animal{

    @Override
    void tiengKeu() {
        System.out.println("gau gau");
    }

    public Dog() {
    }

    public Dog(String ten) {
        super(ten);
    }

    public Dog(String ten, int tuoi) {
        super(ten, tuoi);
    }

    public Dog(String ten, int tuoi, String moTa) {
        super(ten, tuoi, moTa);
    }
    
}
