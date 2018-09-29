/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinnerclass;

/**
 *
 * @author MyPC
 */
public class test {
    public static void main(String[] args) {
        TestInnerClass ad = new TestInnerClass();
        TestInnerClass.abc d = ad.new abc();
    }
}
