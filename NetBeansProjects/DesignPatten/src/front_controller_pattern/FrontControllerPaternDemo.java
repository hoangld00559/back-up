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
public class FrontControllerPaternDemo {
    public static void main(String[] args) {
        
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("home");
        frontController.dispatchRequest("student");
    }
}
