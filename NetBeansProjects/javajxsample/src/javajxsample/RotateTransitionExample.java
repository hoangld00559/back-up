/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajxsample;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author MyPC
 */
public class RotateTransitionExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Creating a hexagon
        Polygon hexagon = new Polygon();
        //Adding coordinates to the hexagon
        hexagon.getPoints().addAll(new Double[]{
            200.0, 50.0,
            400.0, 50.0,
            450.0, 150.0,
            400.0, 250.0,
            200.0, 250.0,
            150.0, 150.0,
        });
        //Setting the fill color for the hexagon
        hexagon.setFill(Color.BLUE);
        
        //Creating a rotate transition
        RotateTransition rotateTransition = new RotateTransition();
        //Setting the duration for the transition
        rotateTransition.setDuration(Duration.millis(1000));
        //Setting the node for the transition
        rotateTransition.setNode(hexagon);
        //Setting the angle of the rotation
        rotateTransition.setByAngle(100);
        //Setting the cycle count for the transition
        rotateTransition.setCycleCount(10);
        //Setting auto reverse value to false
        rotateTransition.setAutoReverse(true);
        //Playing the animation
        rotateTransition.play();
        //Creating a Group object
        Group root = new Group(hexagon);
        Scene scene = new Scene(root, 600, 300);
        primaryStage.setTitle("Rotate transition example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
