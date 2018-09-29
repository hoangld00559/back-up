/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajxsample;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author MyPC
 */
public class ScaleTransitonExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Drawing a Circle
        Circle circle = new Circle();
        //Setting the position of the circle
        circle.setCenterX(300.0);
        circle.setCenterY(135.0);
        //Setting the radius of the circle
        circle.setRadius(50);
        //Setting the color of the circle
        circle.setFill(Color.BROWN);
        //Creating scale transion
        ScaleTransition scaleTransition = new ScaleTransition();
        scaleTransition.setDuration(Duration.millis(1000));
        scaleTransition.setNode(circle);
        scaleTransition.setByX(1.5);
        scaleTransition.setByY(1.5);
        scaleTransition.setCycleCount(50);
        scaleTransition.setAutoReverse(false);
        scaleTransition.play();
        //Creating a Group object
        Group root = new Group(circle);
        Scene scene = new Scene(root, 600, 300);
        primaryStage.setTitle("Scale transition example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
