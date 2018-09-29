/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajxsample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author MyPC
 */
public class EventFiltersExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Drawing a Circle
        Circle circle = new Circle();
        //Setting the position of the circle
        circle.setCenterX(300.0f);
        circle.setCenterY(135.0f);
        //Setting the radius of the circle
        circle.setRadius(25.0f);
        circle.setFill(Color.BROWN);
        Text text = new Text("Click on the circle to change its color");
        text.setFont(Font.font(null,FontWeight.BOLD,15));
        text.setFill(Color.CRIMSON);
        text.setX(150);
        text.setY(50);
        //Creating the mouse event handler
        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Hello World");
                circle.setFill(Color.DARKSLATEBLUE);
            }
        };
        
        //Registering the event filter
        circle.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
        //Creating a Group object
        Group root = new Group(circle, text);
        //Creating a scene object
        Scene scene = new Scene(root, 600, 300);
        scene.setFill(Color.LAVENDER);
        primaryStage.setTitle("Event Filters Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
