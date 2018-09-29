/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sysncdemo;

import java.util.logging.Level;
import java.util.logging.Logger;

class Sender {

    public void send(String msg) {
        System.out.println("Sending\t" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Thread interruped.");
        }
        System.out.println("\n" + msg + "Sent");
    }
}
// Class for send a message using Threads

class ThreadedSend extends Thread {

    private String msg;
    private Thread t;
    Sender sender;

    // Recieves a message object and a string
    // message to be sent
    ThreadedSend(String m, Sender obj) {
        msg = m;
        sender = obj;
    }

    @Override
    public void run() {
        //Only one thread can send a message
        // at a time
        synchronized (this) {

            sender.send(msg);
        }
    }
}

public class SysncDemo {

    public static void main(String[] args) {
        Sender snd = new Sender();
        ThreadedSend s1 = new ThreadedSend(" Hi ", snd);
        ThreadedSend s2 = new ThreadedSend(" Bye", snd);

        s1.start();
        s2.start();

        try {
            s1.join();
            s2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(SysncDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
