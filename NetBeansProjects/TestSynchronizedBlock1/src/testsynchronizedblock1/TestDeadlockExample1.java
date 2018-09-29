/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsynchronizedblock1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class TestDeadlockExample1 {
    public static void main(String[] args){
        final String resource1 = "ratan jaiswal";
        final String resource2 = "vimal jaiswal";
        //t1 tries to lock resource1 then resource2
        Thread t1 = new Thread(){
            @Override
            public void run(){
                try {
                    synchronized(resource1){
                        System.out.println("Thread1: locked resouce 1");
                    }
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                
                synchronized(resource2){
                    System.out.println("Thread 1: locked resouce 2");
                }
            }
        };
        
        // t2 tries to lock resource2 then resource1
        Thread t2 = new Thread(){
            @Override
            public void run(){
                synchronized(resource2){
                    try {
                        System.out.println("Thread2: locked resource 2");
                        
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(TestDeadlockExample1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    synchronized(resource1){
                        System.out.println("Thread 2: locked resouce 1");
                    }
                }
            }
        };
        
        t1.start();
        t2.start();
    }
}
