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
public class MyMethods {
    int total() {
        int a_Value = 10 + 10;
        
        return a_Value;
    }
    
    void print_text() {
        System.out.println("Some Text Here");
    }
    
    int total(int aNumber) {
        int a_Value = aNumber + 20;
        return a_Value;
    }
    
    void print_text(String aString, int aVal) {
        System.out.println(aString + aVal);
    }
}
