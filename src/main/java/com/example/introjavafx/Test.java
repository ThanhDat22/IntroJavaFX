package com.example.introjavafx;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Test extends Application {
    public Test() {
        System.out.println("Test constructor is invoked");
    }

        /**Override the start method in the Application class
         * @param primaryStage: the stage
         * @throws IOException
         */
        @Override
        public void start (Stage primaryStage) throws IOException {
        }
    public static void main(String[] args) {
            System.out.println("launch application");
            launch(args);
    }
}
