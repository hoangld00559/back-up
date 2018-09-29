/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleabstract;

interface Developer {
    void disp();
}

interface Manager {
    void show();
}
public class Employee implements Developer, Manager{

    @Override
    public void disp() {
        System.out.println("Hello Good Morning");
    }

    @Override
    public void show() {
        System.out.println("How are you ?");
    }
    
    public static void main(String args[]){
        Employee obj = new Employee();
        obj.disp();
        obj.show();
    }
}
