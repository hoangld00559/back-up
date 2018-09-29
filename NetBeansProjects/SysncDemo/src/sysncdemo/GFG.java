/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sysncdemo;



class Line {
    // if multiple threads(trains) will try to
    // access this unsynchronized method,
    // they all will get it. So there is chance
    // that Object's state will be corrupted.
    synchronized public void getLine() {
        for(int i=0; i<3; i++){
            System.out.println(i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}

class Train extends Thread {
    // reference to Line's Object.
    Line line;
    Train(Line line){
        this.line = line;
    }
    
    @Override
    public void run() {
        line.getLine();
    }
    
}
public class GFG {
    public static void main(String[] args){
        // Object of Line class that is shared
        // among the threads.
        Line obj = new Line();
        
        // creating the threads that are
        // sharing the same Object.
        
        Train train1 = new Train(obj);
        Train train2 = new Train(obj);
        
        // threads start their execution.
        train1.start();
        train2.start();
    }
}
