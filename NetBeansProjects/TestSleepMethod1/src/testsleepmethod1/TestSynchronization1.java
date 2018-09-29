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
class Table1{
    synchronized void printTable(int n){//method not synchronozed
        for (int i = 1; i <= 5; i++) {
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException ex) {
                Logger.getLogger(Table1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

class MyThread10 extends Thread{
    Table1 t;

    MyThread10(Table1 t) {
        this.t = t;
    }
    @Override
    public void run(){
        t.printTable(5);
    }
}

class MyThread20 extends Thread{
    Table1 t;
    MyThread20(Table1 t){
        this.t = t;
    }
    @Override
    public void run(){
        t.printTable(100);
    }
}
public class TestSynchronization1 {
    public static void main(String[] args) {
        Table1 obj = new Table1();// only one object
        MyThread10 t1 = new MyThread10(obj);
        MyThread20 t2 = new MyThread20(obj);
        t1.start();
        t2.start();
    }
}
