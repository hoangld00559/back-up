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
public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        
        service.execute();
        service = ServiceLocator.getService("Service2");
        
        service.execute();
        service = ServiceLocator.getService("Service1");
        
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
