/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo2;


class Thread3 extends Thread{
    @Override
    public void run(){
        try {
            // Displaying the thread that is running
        System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        }catch (Exception e){
            // displat the exception
            e.printStackTrace();           
        }        
    }
}

//Main Class
public class ThreadTest3 {
    public static void main(String[] args){
        int n = 8;
        for(int i=0; i<n; i++){
            Thread3 object = new Thread3();
            
            //start() is replaced with run() for
            //seeing the purpose of start
            object.start();
        }
    }
}
