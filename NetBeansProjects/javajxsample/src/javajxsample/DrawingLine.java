/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajxsample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author MyPC
 */
public class DrawingLine extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        //Creating a line object
        Line line = new Line();
        
        //Setting the properties to a line
        line.setStartX(100.0);
        line.setStartY(150.0);
        line.setEndX(500.0);
        line.setEndY(150.0);
        
        // Creating a Group
        Group root = new Group(line);
        
        // creating a Scene
        Scene scene = new Scene(root, 600, 300);
        
        //setting title to the scene
        stage.setTitle("Sample application");
        
        //Adding the scene to the stage
        stage.setScene(scene);
        
        //Displaying the contents of a scene
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
