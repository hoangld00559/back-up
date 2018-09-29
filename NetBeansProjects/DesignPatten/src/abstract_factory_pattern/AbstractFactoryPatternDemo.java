/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_factory_pattern;

/**
 *
 * @author MyPC
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        
        //get an object of shape circle
        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();
        
        //get an object of shape rectangle
        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();
        
        //get an object of circle rectangle
        Shape shape3 = shapeFactory.getShape("square");
        shape3.draw();
        
        //get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        
        //get an object of color red
        Color color1 = colorFactory.getColor("red");
        color1.fill();
        
        //get an object of color green
        Color color2 = colorFactory.getColor("green");
        color2.fill();
        
        //get an object of color blue
        Color color3 = colorFactory.getColor("blue");
        color3.fill();
        
    }
}
