/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multi;

import java.util.logging.Level;
import java.util.logging.Logger;

class Table {
    synchronized void printTable(int n){
        // method khong synchronized
        for(int i=1; i<=5; i++){
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
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
public class TestSynchronization1 {
    public static void main(String args[]){
        Table obj = new Table(); // tao mot object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
