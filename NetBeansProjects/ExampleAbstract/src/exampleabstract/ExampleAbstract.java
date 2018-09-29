/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleabstract;

abstract class Vachile {
    int limit = 40;
    Vachile() {
        System.out.println("constructor is invoked");
    }
    void getDetails(){
        System.out.println("it has two wheels");
    }
    abstract void run();
}
public class ExampleAbstract extends Vachile{

    @Override
    void run() {
        System.out.println("running safety...");
    }
    public static void main(String[] args) {
        Vachile obj = new ExampleAbstract();
        obj.run();
        obj.getDetails();
        System.out.println(obj.limit);
    }
}
