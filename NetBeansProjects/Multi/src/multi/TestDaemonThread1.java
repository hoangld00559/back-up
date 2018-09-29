/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multi;

/**
 *
 * @author MyPC
 */
public class TestDaemonThread1 extends Thread{
    @Override
    public void run(){
        
        // check luong hiem
        if(Thread.currentThread().isDaemon()){
            System.out.println("luong hiem hoat dong");
        }else {
            System.out.println("luong nguoi dung hoat dong");
        }
    }
    
    public static void main(String[] args){
        TestDaemonThread1 t1 = new TestDaemonThread1(); // tao thread
        TestDaemonThread1 t2 = new TestDaemonThread1();
        TestDaemonThread1 t3 = new TestDaemonThread1();
        
        t1.setDaemon(true); // cai dat t1 la luong hiem
        
        t1.start();
        t2.start();
        t3.start();
    }
}
