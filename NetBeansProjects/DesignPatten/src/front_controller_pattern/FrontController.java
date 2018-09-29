/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front_controller_pattern;

/**
 *
 * @author MyPC
 */
public class FrontController {
    private Dispatcher dispatcher;
    
    public FrontController(){
        dispatcher = new Dispatcher();
    }
    
    private boolean isAuthenricUser(){
        System.out.println("User is authenticated successfully.");
        return true;
    }
    
    private void trackRequest(String request){
        System.out.println("Page requested: " + request);
    }
    
    public void dispatchRequest(String request){
        //log each request
        trackRequest(request);
        
        //authenticate the user
        if(isAuthenricUser()){
            dispatcher.dispatch(request);
        }
    }
}
