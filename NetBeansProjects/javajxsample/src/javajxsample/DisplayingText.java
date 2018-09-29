/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajxsample;

import java.awt.Font;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author MyPC
 */
public class DisplayingText extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        // Creating a Text object
        Text text = new Text();
        
        //Setting font to the text
        text.setFont(new javafx.scene.text.Font(30));
        
        //Setting the possition of the text
        text.setX(200);
        text.setY(150);
        
        //Setting the text to be added.
        text.setText("Welcome to hoang pro");
        
        //Creating a group object
        Group root = new Group();
        
        //Retrieving the observable list object
        ObservableList list = root.getChildren();
        
        //Setting the text object as a node to the group object
        list.add(text);
        
        //Creating a scene object
        Scene scene = new Scene(root, 600, 300);
        
        //Setting title to the Stage
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
