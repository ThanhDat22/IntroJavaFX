package com.example.introjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class ShowCircle extends Application {
    /**Override the start method in the Application class
     * @param primaryStage: the stage
     * @throws IOException
     */
    @Override
    public void start(Stage primaryStage) throws IOException {
        // Creates a circle and set its properties
        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);

        // Creates a pane to hold the circle
        Pane pane = new Pane();
        pane.getChildren().add(circle);

        // Creates a scene and place it in the stage
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("ShowCircle"); // Set the stage tile
        primaryStage.setScene(scene); // place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}
