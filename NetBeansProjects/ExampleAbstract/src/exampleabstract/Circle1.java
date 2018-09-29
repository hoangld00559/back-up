/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleabstract;

// lop truu tuong Shape
abstract class Shape{
    abstract void draw();
}

// Trong tinh huong nay, trinh trien khai duoc cung cap boi ai do
// vi du: nguoi su dung cuoi cung nao do
class Rectangle extends Shape {
    @Override
    void draw(){
        System.out.println("Ve hinh chu nhat");
    }
}
public class Circle1 extends Shape{

    @Override
    void draw() {
        System.out.println("Ve hinh tron");
    }    
}

// Trong tinh huong nay, phuong thuc duoc goi boi lap trinh vien hoac nguoi dung
class TestAbstraction1 {
    public static void main(String args[]){
    // Trong tinh huong nay, doi tuong duoc cung cap thong qua phuong thuc,
    // chang han nhu getShape()
    Shape s = new Circle1();
    s.draw();
    }
}
