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
public class TestSleepMethod1 extends Thread{

    @Override
    public void run(){
        for(int i=1; i<5; i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(i);
        }
    }
        
        
    public static void main(String[] args) {
        // TODO code application logic here
        TestSleepMethod1 t1 = new TestSleepMethod1();
        TestSleepMethod1 t2 = new TestSleepMethod1();
        
        t1.start();
        t2.start();
    }
    
}
