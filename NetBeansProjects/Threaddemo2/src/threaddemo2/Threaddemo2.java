/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo2;

/**
 *
 * @author MyPC
 */
class Th1 extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("value of i= " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ie) {
            System.err.println("Problem in thread execution");
        }
    }
}

public class Threaddemo2 {

    public static void main(String[] args) {
        Th1 t1 = new Th1();
        System.out.println("Execution status of t1 before start=" + t1.isAlive());
        t1.start();
        System.out.println("Execution status of t1 before start=" + t1.isAlive());
        try {
            Thread.sleep(5000);
        }catch(InterruptedException ie){
            System.out.println("Problem in thread executon");
        }
        System.out.println("Execution status of t1 during excution=" + t1.isAlive());
        try {
            Thread.sleep(5001);
        }catch(InterruptedException ie){
            System.out.println("problem in thread execution");
        }
        System.out.println("Executin status of t1 after completation=" + t1.isAlive());
    }

}
