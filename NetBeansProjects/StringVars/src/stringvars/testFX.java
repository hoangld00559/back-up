/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringvars;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author MyPC
 */
public class testFX extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Hyperlink link1 = new Hyperlink("link1");
        Hyperlink link2 = new Hyperlink("link2");
        VBox vbox = new VBox(link1,link2);
        vbox.setMinWidth(200);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox.setSpacing(20);
        Pane pane = new Pane();        
        BorderPane borderPane = new BorderPane();
        borderPane.setLeft(vbox);        
        borderPane.setCenter(pane);
        Scene scene = new Scene(borderPane, 600, 300);
        link1.setOnMouseClicked((event) -> {
            
        });
        
        
        primaryStage.setTitle("nghich");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
