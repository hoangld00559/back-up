/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsleepmethod1;

import java.util.logging.Level;
import java.util.logging.Logger;

class Table {

    synchronized static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
            }
        }
    }
}

class MyThread1 extends Thread {

    public void run() {
        Table.printTable(1);
    }
}

class MyThread2 extends Thread {

    public void run() {
        Table.printTable(10);
    }
}

class MyThread3 extends Thread {

    @Override
    public void run() {
        Table.printTable(100);
    }
}

class MyThread4 extends Thread {

    @Override
    public void run() {
        Table.printTable(1000);
    }
}

public class TestSynchronization4 {

    public static void main(String t[]) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();
        MyThread4 t4 = new MyThread4();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(TestSynchronization4.class.getName()).log(Level.SEVERE, null, ex);
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(TestSynchronization4.class.getName()).log(Level.SEVERE, null, ex);
        }
        t3.start();
        try {
            t3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(TestSynchronization4.class.getName()).log(Level.SEVERE, null, ex);
        }
        t4.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(TestSynchronization4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
