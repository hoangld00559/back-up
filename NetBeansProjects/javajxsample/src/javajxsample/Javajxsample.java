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
import javafx.stage.Stage;

/**
 *
 * @author MyPC
 */
public class Javajxsample extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }
    

    @Override
    public void start(Stage stage) throws Exception {
        // creating a Group object
        Group group = new Group();
        
        // Creating a Scene by passing the group object, heigh and width
        Scene scene = new Scene(group, 600, 300);
        
        // setting color to the scene
        scene.setFill(Color.BROWN);
        
        // setting the title to Stage.
        stage.setTitle("Sample Application");
        
        // adding the scene to Stage
        stage.setScene(scene);
        
        // Display the contents of the stage
        stage.show();
    }
    
}
