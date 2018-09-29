/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multi;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class Workerthread implements Runnable{
    private String message;
    
    public Workerthread(String s){
        this.message = s;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()
        + "  (Start) message= " + message);
        processMessage();
        System.out.println(Thread.currentThread().getName()
                +" (End)");
    }
    
    private void processMessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
}
