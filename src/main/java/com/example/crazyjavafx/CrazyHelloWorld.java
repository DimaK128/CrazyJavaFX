package com.example.crazyjavafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class ExoticApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Exotic App");

        // Creating controls
        Label label1 = new Label("Text Field 1:");
        TextField textField1 = new TextField();
        Label label2 = new Label("Text Field 2:");
        TextField textField2 = new TextField();
        Label label3 = new Label("Text Field 3:");
        TextField textField3 = new TextField();
        Button button1 = new Button("Run the action Copy text");
        Button button2 = new Button("Press enter (TextFieldAction) - copy text into label");
        Button button3 = new Button("Copy to start button");

        // Setting actions for buttons
        button1.setOnAction(e -> {
            String text = textField1.getText();
            textField2.setText(text);
        });

        button2.setOnAction(e -> {
            String text = textField2.getText();
            textField1.setText(text);
            textField3.setText(text);
        });

        button3.setOnAction(e -> {
            String text = textField3.getText();
            textField1.setText(text);
            textField2.setText(text);
        });

        // Creating arrows
        Line arrow1 = new Line(130, 90, 130, 150);
        Line arrow2 = new Line(270, 90, 270, 150);
        Line arrow3 = new Line(270, 210, 270, 270);
        Line arrow4 = new Line(270, 310, 270, 370);
        Line arrow5 = new Line(270, 410, 270, 470);
        Line arrow6 = new Line(270, 510, 270, 570);

        // Creating layout
        Pane pane = new Pane();
        pane.getChildren().addAll(arrow1, arrow2, arrow3, arrow4, arrow5, arrow6);
        pane.getChildren().addAll(label1, label2, label3, textField1, textField2, textField3);
        pane.getChildren().addAll(button1, button2, button3);
        GridPane.setConstraints(label1, 0, 0);
        GridPane.setConstraints(textField1, 1, 0);
        GridPane.setConstraints(label2, 0, 1);
        GridPane.setConstraints(textField2, 1, 1);
        GridPane.setConstraints(label3, 0, 2);
        GridPane.setConstraints(textField3, 1, 2);
        GridPane.setConstraints(button1, 0, 3);
        GridPane.setConstraints(button2, 0, 4);
        GridPane.setConstraints(button3, 0, 5);

        // Setting up the scene
        Scene scene = new Scene(pane, 400, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
