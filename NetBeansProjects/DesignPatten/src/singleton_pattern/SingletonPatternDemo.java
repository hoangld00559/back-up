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
public class SingletonPatternDemo {
    public static void main(String[] args) {
        //illegal construct
        //Compile Time Error: the constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();
        
        //get the only object available
        SingleObject object = SingleObject.getInstance();
        
        //show the message
        object.showMessage();
    }
}
