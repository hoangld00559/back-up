/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service_locator_pattern;

/**
 *
 * @author MyPC
 */
public class InitialContext {
    public Object lookup(String jndiName){
        if(jndiName.equalsIgnoreCase("Sevice1")){
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        }
        else if(jndiName.equalsIgnoreCase("Service2")){
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
        return null;
    }
}
