/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajxsample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.Bloom;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author MyPC
 */
public class BloomEffectExample extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        //Creating a text object
        Text text = new Text();
        
        //Setting font to the text
        text.setFont(Font.font(null, FontWeight.BOLD, 40));
        
        
        // setting the position of the text
        text.setX(60);
        text.setY(150);
        
        //setting the text to the embedded
        text.setText("Wellcom to Fpt School");
        
        //setting the color of the text
        text.setFill(Color.PINK);
        
        // instantiating the rectangle class
        Rectangle rectangle = new Rectangle();
        
        //setting the position of the rectangle
        rectangle.setX(50.0f);
        rectangle.setY(80.0f);
        
        //setting the width of the rectangle
        rectangle.setWidth(500.0);
        rectangle.setHeight(120.0);
        
        //setting the color of the rectangle
        rectangle.setFill(Color.TEAL);
        
        //Instantiating the Bloom class
        Bloom bloom = new Bloom();
        
        //setting threshold for bloom
        bloom.setThreshold(0.1);
        
        //Applying bloom effect to text
        text.setEffect(bloom);
        
        //Creating a Group object
        Group root = new Group(rectangle, text);
        
        //Creating a scene object
        Scene scene = new Scene(root, 600, 330);
        
        //setting title to the Stage
        stage.setTitle("Sample Application");
        
        //Adding scene to the stage
        stage.setScene(scene);
        
        //Displaying the contents of the stage
        stage.show();
        
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
