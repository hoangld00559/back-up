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
public class WorkerThread implements Runnable{
    private String message;
    public WorkerThread(String s){
        this.message = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " (Start) message =" + message);
        processmessage();// call processmessage method that sleeps the theard for 2 seconds
        System.out.println(Thread.currentThread().getName() + " (End)");// prints thead name
    }
    private void processmessage(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(WorkerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
