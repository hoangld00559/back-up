/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service_locator_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MyPC
 */
public class Cache {
    private List<Service> services;
    
    public Cache(){
        services = new ArrayList<>();
    }
    
    public Service getService(String serviceName){
        for(Service service: services){
            if(service.getName().equalsIgnoreCase(serviceName)){
                System.out.println("Return cached " + serviceName + " object");
                return service;
            }
        }
        return null;
    }
    
    public void addService(Service newService){
        boolean exists = false;
        
        for(Service service: services){
            if(service.getName().equalsIgnoreCase(newService.getName())){
                exists = true;
            }
        }
        if(!exists){
            services.add(newService);
        }
    }
}
