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
public class TestJoinMethod1 extends Thread{
    @Override
    public void run(){
        for(int i=1; i<=5; i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(TestJoinMethod1.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        TestJoinMethod1 t1 = new TestJoinMethod1();
        TestJoinMethod1 t2 = new TestJoinMethod1();
        TestJoinMethod1 t3 = new TestJoinMethod1();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(TestJoinMethod1.class.getName()).log(Level.SEVERE, null, ex);
        }
        t2.start();
        t3.start();
    }
}
