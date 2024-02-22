package com.example.introjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ButtonInPane extends Application {
    /**Override the start method in the Application class
     * @param primaryStage: the stage
     * @throws IOException
     */
    @Override
    public void start(Stage primaryStage) throws IOException {
        // Creates the scene and place a button in the scene
        StackPane pane = new StackPane(); // Creates a pane
        pane.getChildren().add(new Button("OK")); // Adds a button
        Scene scene = new Scene(pane,300,50); // Adds pane to scene
        primaryStage.setTitle("Button in pane"); // Sets the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Displays the stage
    }
}
