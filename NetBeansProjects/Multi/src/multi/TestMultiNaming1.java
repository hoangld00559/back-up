/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multi;


public class TestMultiNaming1 extends Thread{
    @Override
    public void run(){
        System.out.println("running....");
    }
    
    public static void main(String args[]){
        TestMultiNaming1 t1 = new TestMultiNaming1();
        TestMultiNaming1 t2 = new TestMultiNaming1();
        System.out.println("Name of t1");
    }
}
