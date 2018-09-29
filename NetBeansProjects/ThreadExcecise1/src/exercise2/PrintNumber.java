/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrintNumber extends Thread {   

    synchronized void printNumOdd(int a) {

        
        try {
            wait();
            notify();
        } catch (InterruptedException ex) {
            Logger.getLogger(PrintNumber.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    synchronized void printNumEven(int a) {

        System.out.println("Thread one: " + a);
        try {
            notify();
            wait();

        } catch (InterruptedException ex) {
            Logger.getLogger(PrintNumber.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n= ");
        int n = input.nextInt();
        PrintNumber pr = new PrintNumber();
        for (int i=0; i <= n; i++) {
            if (i % 2 == 0) {
                new Thread(){
                    @Override
                    public void run(){
                       
                    }
                }.start();               
            } else {

            }
        }
    }
}
