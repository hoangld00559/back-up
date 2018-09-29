/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajxsample;


import java.io.FileInputStream;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author MyPC
 */
public class ImageExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Creating an image
        Image image = new Image("https://i.ytimg.com/vi/nyDPP8MVLCs/maxresdefault.jpg");
        //Setting the image view
        ImageView imageView = new ImageView(image);
        //Setting the position of the image
        imageView.setX(100);
        imageView.setY(20);
        //Setting the fit height and width of the image view
        imageView.setFitHeight(455);
        imageView.setFitWidth(500);
        //Setting the preserve ratio of the image view
        imageView.setPreserveRatio(true);
        Group root = new Group(imageView);
        Scene scene = new Scene(root, 700,400);
        primaryStage.setTitle("Loading an image");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
