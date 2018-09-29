/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsynchronizedblock1;

import java.util.logging.Level;
import java.util.logging.Logger;

class Table {
    void printTable(int n){
        synchronized(this){ // Khoi dong bo(synchronized block)
            for(int i=1; i<=5; i++){
                System.out.println(n*i);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }
            }
        }
    }// Ket thuc phuong thuc
}

class MyThread1 extends Thread {
    Table t;
    
    MyThread1(Table t){
        this.t = t;
    }
    
    @Override
    public void run(){
        t.printTable(5);
    }
}

class MyThread2 extends Thread {
    Table t;
    
    MyThread2(Table t){
        this.t = t;
    }
    
    @Override
    public void run(){
        t.printTable(100);
    }
}
public class TestSynchronizedBlock1 {

    
    public static void main(String[] args) {
        Table obj = new Table(); // tao object duy nhat
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
    
}
