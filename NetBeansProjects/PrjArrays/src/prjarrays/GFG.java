/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjarrays;

/**
 *
 * @author MyPC
 */

abstract class Shape {
    // declare fields
    String objectName = " ";
    Shape(String name){
        this.objectName = name;
    }
    // declare non-abstract methods
    // it has default implementation
    public void moveTo(int x, int y){
        System.out.println(this.objectName + " " 
                + "has been moved to " + " x = " + x +
                " and y = " + y
        );
    }
    
    // abstract methods which will be
    // implemented by its subclass(es)
    abstract public double area();
    abstract public void draw();
}


class Rectangle extends Shape {
    
    int length, width;
    
    // constructor
    Rectangle(String name, int length, int width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return (double)(length*width);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle has been drawn ");
    }
}

class Circle extends Shape {
    
    double pi = 3.14;
    int radius;
    // constructor

    Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double area() {
        return (double)((pi*radius*radius)/2);
    }

    @Override
    public void draw() {
        System.out.println("Circle has been drawn");
    }
    
}
class GFG {
    public static void main(String[] args) {
        // creating the object of Rectangle class
        // and using shape class reference.
        Arraystest a = new Arraystest();
        Shape rect = new Rectangle("Rectange", 2,3);
        System.out.println("Area of rectangle: "+ rect.area());
        rect.moveTo(1, 2);
        System.out.println(" ");
        // creating the objects of circle class
        Shape circle = new Circle("Circle", 2);
        System.out.println("Area of circle: " + circle.area());
        circle.moveTo(2, 4);
    }
}
