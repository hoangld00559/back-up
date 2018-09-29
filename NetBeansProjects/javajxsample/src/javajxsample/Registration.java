/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajxsample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author MyPC
 */
public class Registration extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Text namLabel = new Text("Name");
        TextField namText = new TextField();
        Text dobLabel = new Text("Date of birth");
        DatePicker datePicker = new DatePicker();
        Text genderLabel = new Text("gender");
        ToggleGroup groupGender = new ToggleGroup();
        RadioButton maleButton = new RadioButton("male");
        maleButton.setToggleGroup(groupGender);
        RadioButton femaleButton = new RadioButton("female");
        femaleButton.setToggleGroup(groupGender);
        Text reservationLabel = new Text("Reservation");
//        ToggleButton reservation = new ToggleButton();
        ToggleButton yes = new ToggleButton("Yes");
        ToggleButton no = new ToggleButton("No");
        ToggleGroup groupReservation = new ToggleGroup();
        yes.setToggleGroup(groupReservation);
        no.setToggleGroup(groupReservation);
        Text technologiesLabel = new Text("Technologies Known");
        CheckBox javaCheckBox = new CheckBox("Java");
//        javaCheckBox.setIndeterminate(false);
        CheckBox dotnetCheckBox = new CheckBox("DotNet");
        dotnetCheckBox.setIndeterminate(false);
        Text educationLabel = new Text("Education qualification");
//        ObservableList<String> names = FXCollections.observableArrayList(
//                "Engineering", "MCA", "MBA", "Graduation", "Mtech", "mphil", "phd");
        ListView<String> educationListView = new ListView<>();
        educationListView.getItems().addAll("Engineering", "MCA", "MBA", "Graduation", "Mtech", "mphil", "phd");
//        educationListView.setMaxHeight(200);
        Text locationLabel = new Text("location");
        ChoiceBox locationchoiceBox = new ChoiceBox();
        locationchoiceBox.getItems().addAll("Hyderabed", "Chennai", "Delhi", "Mumbai", "Vishakhapatnam");
        Button buttonRegister = new Button("Register");
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(500, 500);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(namLabel, 0, 0);
        gridPane.add(namText, 1, 0);

        gridPane.add(dobLabel, 0, 1);
        gridPane.add(datePicker, 1, 1);

        gridPane.add(genderLabel, 0, 2);
        gridPane.add(maleButton, 1, 2);
        gridPane.add(femaleButton, 2, 2);
        gridPane.add(reservationLabel, 0, 3);
        gridPane.add(yes, 1, 3);
        gridPane.add(no, 2, 3);

        gridPane.add(technologiesLabel, 0, 4);
        gridPane.add(javaCheckBox, 1, 4);
        gridPane.add(dotnetCheckBox, 2, 4);

        gridPane.add(educationLabel, 0, 5);
        gridPane.add(educationListView, 1, 5);

        gridPane.add(locationLabel, 0, 6);
        gridPane.add(locationchoiceBox, 1, 6);

        gridPane.add(buttonRegister, 2, 8);

        //Styling nodes   
        buttonRegister.setStyle(
                "-fx-background-color: darkslateblue; -fx-textfill: white;");

        namLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        dobLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        genderLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        reservationLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        technologiesLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        educationLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        locationLabel.setStyle("-fx-font: normal bold 15px 'serif' ");

        //Setting the background color
        gridPane.setStyle("-fx-background-color: BEIGE;");

        Scene scene = new Scene(gridPane);

        primaryStage.setTitle("Registration Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
