/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo2;

//MyThread extending Thread
class Mythread extends Thread{
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName()+ "in control");
        }
    }
}

//Driver Class
public class YieldDemo {
    public static void main(String[] args){
        Mythread t = new Mythread();
        t.start();
        
        for(int i=0; i<5; i++){
            // Control passes to child thread
            Thread.yield();
            
            //After execution of child thread
            // main thread takes over
            
            System.out.println(Thread.currentThread().getName() + "in control");
        }
    }
}
