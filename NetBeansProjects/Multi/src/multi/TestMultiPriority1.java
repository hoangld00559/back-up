/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multi;

public class TestMultiPriority1 extends Thread{
    @Override
    public void run(){
        System.out.println("running thread name is:"
                        + Thread.currentThread().getName());
        System.out.println("running thread priority is:"
                        + Thread.currentThread().getPriority());
    }
    
    public static void main(String[] args){
        TestMultiPriority1 m1 = new TestMultiPriority1();
        TestMultiPriority1 m2 = new TestMultiPriority1();
        
        m1.setPriority(MIN_PRIORITY);
        m2.setPriority(MAX_PRIORITY);
        
        m1.start();
        m2.start();
   
    }
}
