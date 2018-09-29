/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;

import java.net.InetAddress;

/**
 *
 * @author MyPC
 */
public class InetDemo {

    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.google.com");

            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());
        }
        catch(Exception e){        
            System.out.println(e);
        }
    }
}
