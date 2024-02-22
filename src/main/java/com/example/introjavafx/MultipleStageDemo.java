package com.example.introjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MultipleStageDemo extends Application {
    /**Override the start method in the Application class
     * @param primaryStage: the stage
     * @throws IOException
     */
    @Override
    public void start(Stage primaryStage) throws IOException{
        // Creates the scene and place a button in the scene
        Scene scene = new Scene(new Button("OK"), 200,250);

        primaryStage.setTitle("MyJavaFX"); // Sets the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Displays the stage

        Stage stage = new Stage(); // Creates a new stage
        stage.setTitle("Second Stage"); // Set the stage title
        // Set a scene with a button in the stage
        stage.setScene(new Scene(new Button("New Stage"), 200, 250));
        stage.show(); //Display the stage
    }

    public static void main(String[] args) {
        launch(args);
    }

}
