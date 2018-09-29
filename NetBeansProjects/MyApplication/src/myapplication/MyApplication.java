/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapplication;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author MyPC
 */
public class MyApplication extends Application {

    private Scene scene1;
    private Scene scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20, 20, 20, 20));
        gridPane.setVgap(20);
        gridPane.setHgap(20);
        gridPane.setAlignment(Pos.CENTER);
        Label lblUserName = new Label("UserName");
        Label lblEmail = new Label("Email");
        Label lblPassword = new Label("Password");

        TextField txtUsername = new TextField();
        TextField txtEmail = new TextField();
        PasswordField txtPassword = new PasswordField();

        Button btnSumbit = new Button("Sumbit");
        Button btnResert = new Button("Reset");
        
        gridPane.add(lblUserName, 0, 0, 1, 1);
        gridPane.add(lblEmail, 0, 1, 1, 1);
        gridPane.add(lblPassword, 0, 2, 1, 1);
        gridPane.add(txtUsername, 1, 0, 1, 1);
        gridPane.add(txtEmail, 1, 1, 1, 1);
        gridPane.add(txtPassword, 1, 2, 1, 1);

        HBox hBox = new HBox(btnSumbit, btnResert);
        hBox.setSpacing(10);
//        hBox.getChildren().addAll(btnSumbit, btnResert);
        gridPane.add(hBox, 1, 3, 1, 1);
        
        GridPane gridPane2 = new GridPane();
        gridPane2.setPadding(new Insets(20, 20, 20, 20));
        gridPane2.setVgap(20);
        gridPane2.setHgap(20);
        gridPane2.setAlignment(Pos.CENTER);
        Label lblUserName2 = new Label("UserName");
        Label lblPassword2 = new Label("Password");

        TextField txtUsername2 = new TextField();
        PasswordField txtPassword2 = new PasswordField();

        Button btnSumbit2 = new Button("Sumbit");
        Button btnResert2 = new Button("Reset");
        Button btnRegister = new Button("Register");

        gridPane2.add(lblUserName2, 0, 0, 1, 1);
        gridPane2.add(lblPassword2, 0, 1, 1, 1);
        gridPane2.add(txtUsername2, 1, 0, 1, 1);
        gridPane2.add(txtPassword2, 1, 1, 1, 1);

        HBox hBox2 = new HBox();
        hBox2.setSpacing(10);
        hBox2.getChildren().addAll(btnSumbit2, btnResert2, btnRegister);
        gridPane2.add(hBox2, 1, 3, 1, 1);
        
        

        scene1 = new Scene(gridPane, 700, 400);
        
        scene2 = new Scene(gridPane2, 700, 400);
        
        
        stage.setScene(scene1);
        stage.setTitle("Dang ky");
        
        btnSumbit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                stage.setScene(scene2);
                stage.setTitle("Dang nhap");
            }
        });
        
        btnRegister.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                stage.setScene(scene1);
                stage.setTitle("Dang ky");
            }
        });
        stage.show();
        
    }

}
