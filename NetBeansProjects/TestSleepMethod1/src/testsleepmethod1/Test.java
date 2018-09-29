/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsleepmethod1;

import java.util.logging.Level;
import java.util.logging.Logger;

class Customer {

    int amount = 10000;

    synchronized void withdraw(int amount) {
        System.out.println("going to withdraw...");
        if (this.amount < amount) {
            System.out.println("Less balance; waiting for deposit...");
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.amount -= amount;
        System.out.println("withdraw completed....");
    }

    synchronized void deposit(int amount) {
        System.out.println("going to deposit...");
        this.amount += amount;
        System.out.println("deposit completed....");
        notify();
    }
}

public class Test {

    public static void main(String[] args) {
        final Customer c = new Customer();
        new Thread() {
            @Override
            public void run(){
                c.withdraw(15000);
            }
        }.start();
        new Thread(){
            @Override
            public void run(){
                c.deposit(10000);
            }
        }.start();
    }
}
