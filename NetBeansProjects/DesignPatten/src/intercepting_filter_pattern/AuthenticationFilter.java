/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intercepting_filter_pattern;

/**
 *
 * @author MyPC
 */
public class AuthenticationFilter implements Filter{

    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
    
}
