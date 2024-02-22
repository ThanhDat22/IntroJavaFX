package com.example.introjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class ShowCircleCentered extends Application {
    /**Override the start method in the Application class
     * @param primaryStage: the stage
     * @throws IOException
     */
    @Override
    public void start(Stage primaryStage) throws IOException {
        // Creates a pane to hold the circle
        Pane pane = new Pane();

        // Creates a circle and set its properties
        Circle circle = new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2)); // bind properties
        circle.centerYProperty().bind((pane.heightProperty().divide(2))); // bind properties
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);

        // Adds circle to the pane
        pane.getChildren().add(circle);

        // Create a scene and place it in the stage
        // Creates a scene and place it in the stage
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("ShowCircleCenter"); // Sets the stage tile
        primaryStage.setScene(scene); // Places the scene in the stage
        primaryStage.show(); // Display the stage
    }

}
