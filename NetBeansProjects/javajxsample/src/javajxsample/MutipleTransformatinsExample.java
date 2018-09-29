/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajxsample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

/**
 *
 * @author MyPC
 */
public class MutipleTransformatinsExample extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        //Drawing a Rectangle
        Rectangle rectangle = new Rectangle(50, 50, 100, 75);
        rectangle.setFill(Color.CHOCOLATE);
        rectangle.setStroke(Color.BLACK);
        Rotate rotate = new Rotate();
        rotate.setAngle(20);
        rotate.setPivotX(150);
        rotate.setPivotY(225);
        Scale scale = new Scale();
        scale.setX(1.5);
        scale.setY(1.5);
        scale.setPivotX(300);
        scale.setPivotY(135);
        
        //Creating the translation transformation
        Translate translate = new Translate();
        
        //Setting the x,y,z 
        translate.setX(250);
        translate.setY(0);
        translate.setZ(0);
        
        //Adding all the transformations to the rectangle
        rectangle.getTransforms().addAll(rotate, scale,translate);
        
        // Create a Group object
        Group root = new Group(rectangle);
        
        // Create a Scene object
        Scene scene = new Scene(root, 600, 300);
        stage.setTitle("Mutiple transformations");
        stage.setScene(scene);
        stage.show();
        
    }
    public static void main(String[] args) {
        launch(args);
    }
}
