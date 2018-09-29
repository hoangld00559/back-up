/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsynchronizedblock1;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

class RanDomInt extends Thread {
    int number;
    Random rd = new Random();
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                try {
                    int number = rd.nextInt(100);
                    if (number % 2 == 0) {
                        System.out.println("So chan : " + number);
                    } else {
                        System.out.println("So le : " + number);
                    }
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    
                }
            }
        }
    }
}

public class TestSynchronized1 {

    public static void main(String[] args) {
        RanDomInt a = new RanDomInt();
        a.start();
    }
}
