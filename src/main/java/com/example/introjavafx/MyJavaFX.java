package com.example.introjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MyJavaFX extends Application {
    /**Override the start method in the Application class
     * @param primaryStage: the stage
     * @throws IOException
     */
    @Override
    public void start(Stage primaryStage) throws IOException {
        // Creates the scene and place a button in the scene
        Button btOK = new Button("OK");
        Scene scene = new Scene(btOK, 200, 250);

        primaryStage.setTitle("MyJavaFX"); // Sets the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Displays the stage
    }

    public static void main(String[] args) {
        launch(args);
    }
}