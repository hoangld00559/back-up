/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern3sgt;

/**
 *
 * @author MyPC
 */
public class SingletonPatternDemo {
    public static void main(String[] args){
        // illegal construct
        // Compile time error: the constructor SingleObject()is not visible
        // SingleObject object = new SingleObject();
        
        // Get the only object available
        SingleObject object = SingleObject.getInstance();
        
        // show the message
        object.showMessage();
        
    }
}
