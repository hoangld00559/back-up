/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjmethods;

/**
 *
 * @author MyPC
 */
public class TestMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyMethods test1 = new MyMethods();
        int aVal = test1.total();
        System.out.println("Method result = " + aVal);
        test1.print_text();
        int aVal2 = test1.total(30);
        System.out.println("Methd result2 = " + aVal2);
        test1.print_text("The value was ", aVal2);
    }
    
}
