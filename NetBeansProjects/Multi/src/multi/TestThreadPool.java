/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author MyPC
 */
public class TestThreadPool {
    public static void main(String[] args){
        // tao mot pool chua 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(5);
        
        for(int i=0; i<10; i++){
            Runnable worker = new Workerthread("" + i);
            // call phuong thuc execute cua executorSevice
            executor.execute(worker);
        }
        
        while(!executor.isTerminated()){
        
        }
        System.out.println("Finish all threads");
    }
}
