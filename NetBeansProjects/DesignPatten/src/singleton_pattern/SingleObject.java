/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton_pattern;

/**
 *
 * @author MyPC
 */
public class SingleObject {
    
    //create an object of SingleObject
    private static SingleObject instance = new SingleObject();
    
    //make the constructor private so that this class connot
    //be instantiated
    private SingleObject(){}
    
    //get the only object available
    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World");
    }
}
