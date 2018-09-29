/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsleepmethod1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class TestDeadlockExample1 {
    public static void main(String[] args) {
        final String resource1 = "ratan jaiswal";
        final String resource2 = "vimal jaiswal";
        // t1 tries to lock resource1 than resource2
        Thread t1 = new Thread(){
            @Override
            public void run(){
                synchronized(resource1){
                    System.out.println("Thread 1 : locked resource 1");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(TestDeadlockExample1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    synchronized(resource2){
                        System.out.println("Thread 1 : locked resource 2");
                    }
                }
            }
        };
    
        // t2 tries to lock resource 2 then resource1
        Thread t2 = new Thread(){
            @Override
            public void run(){
                synchronized(resource2){
                    System.out.println("Thread2: locked resource 2");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(TestDeadlockExample1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    synchronized(resource1){
                        System.out.println("Thread 2: locked resource 1");
                    }
                }
            }
        };
        
        t1.start();
        t2.start();
    }
}
