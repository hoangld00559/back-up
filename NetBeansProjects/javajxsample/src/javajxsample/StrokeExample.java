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
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author MyPC
 */
public class StrokeExample extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        // Creating a Text object
        Text text = new Text();
        //Setting font to the text
        text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 50));
        
        //Setting the possition of the text
        text.setX(50);
        text.setY(130);
        
        //Setting the color
        text.setFill(Color.BROWN);
        
        //Setting the Stroke
        text.setStrokeWidth(2);
        //Setting the stroke color
        text.setStroke(Color.PINK);
        
        //Setting the text to be added.
        text.setText("hi how are you");
        
        //Creating a scene object
        Group root = new Group(text);
        Scene scene = new Scene(root, 600, 300);
        
        //Setting title to the Stage
        stage.setTitle("Setting font to the text");
        
        //Adding scene to the stage
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
