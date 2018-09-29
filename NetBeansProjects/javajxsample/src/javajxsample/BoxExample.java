/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajxsample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Box;
import javafx.stage.Stage;

/**
 *
 * @author MyPC
 */
public class BoxExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Drawing a box
        Box box = new Box();
        //Setting the properties of the Box
        box.setHeight(200.0);
        box.setWidth(400.0);
        box.setDepth(200.0);
        //Creating a Group object
        Group root = new Group(box);
        Scene scene = new Scene(root, 600, 300);
        //Setting title to the Stage
        primaryStage.setTitle("Drawing the box");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
