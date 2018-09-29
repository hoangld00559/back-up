/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleabstract;

interface Person {

    void run(); // abtract method
}

public class InterfaceExample1 implements Person {

    @Override
    public void run() {
        System.out.println("Run fast");
    }

    public static void main(String[] args) {
        InterfaceExample1 obj = new InterfaceExample1();
        obj.run();
    }

}
