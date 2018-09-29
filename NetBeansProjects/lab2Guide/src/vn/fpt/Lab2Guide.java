/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt;

/**
 *
 * @author MyPC
 */
public class Lab2Guide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Students studentA;
        Students studentB;
        
        studentA = new Students();
        studentA.printInfo();
        studentB = new Students(1, "Nguyen Van A", true);
        
        studentB.printInfo();
        
        studentB.setName("Nguyen Van B");
        studentB.printInfo();
        
        
    }
    
}
