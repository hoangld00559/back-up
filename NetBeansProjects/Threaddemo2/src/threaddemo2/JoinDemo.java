/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo2;


public class JoinDemo implements Runnable{

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t.getName());
        //checks if current thread is alive
        System.out.println("Is Alive? " + t.isAlive());
    }
    
    public static void main(String[] args) throws Exception{
        Thread t = new Thread(new JoinDemo());
        t.start();
        
        // Waits for 1000ms this thread to die.
        t.join(1000);
        
        System.out.println("\nJoining after 1000" + " mili seconds: \n");
        System.out.println("Current thread: " + t.getName());
        
        //Check if this thread is alive
        System.out.println("Is alive?" + t.isAlive());
    }
}
