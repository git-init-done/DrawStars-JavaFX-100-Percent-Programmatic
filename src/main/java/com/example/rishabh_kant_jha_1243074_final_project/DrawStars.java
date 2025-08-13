/*
* Student Name: Rishabh Kant Jha
* Student Number: 1243074
* Assignment: Final Project
* */

// Organizes the class under a specific project package name.
package com.example.rishabh_kant_jha_1243074_final_project;

import java.security.SecureRandom;
import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

// DrawStars is the main class and extends Application from JavaFX, allowing it to launch a JavaFX application.
public class DrawStars extends Application {
    // A secure random number generator to create random colors for the stars.
    private static final SecureRandom random = new SecureRandom();

    /*
    -> The JavaFX entry point, automatically called when the app launches.
    -> Responsibilities: -
        - Creates a Pane and a Scene (400x400).
        - Defines star shape using Polygon with fixed coordinates.
        - Repeats 18 times to: -
            ~ Create a star shape.
            ~ Fill it with a random color.
            ~ Rotate it around a central point to form a circular layout.
            ~ Apply a RotateTransition animation (360° rotation that loops forever).
            ~ Add the star to the pane.
        - Sets the window title and displays the stage.
     */
    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 400, 400);

        Double[] points = {
                205.0, 150.0, 217.0, 186.0, 259.0, 186.0,
                223.0, 204.0, 233.0, 246.0, 205.0, 222.0,
                177.0, 246.0, 187.0, 204.0, 151.0, 186.0,
                193.0, 186.0
        };

        for (int count = 0; count < 18; ++count) {
            Polygon newStar = new Polygon();
            newStar.getPoints().addAll(points);
            newStar.setStroke(Color.GREY);
            newStar.setFill(Color.rgb(random.nextInt(255), random.nextInt(255), random.nextInt(255), random.nextDouble()));
            newStar.getTransforms().add(new Rotate(count * 20, 150, 150));

            RotateTransition rotateTransition = new RotateTransition(Duration.seconds(2), newStar);
            rotateTransition.setByAngle(360);
            rotateTransition.setCycleCount(Animation.INDEFINITE);
            rotateTransition.play();

            pane.getChildren().add(newStar);
        }

        stage.setTitle("Draw Stars");
        stage.setScene(scene);
        stage.show();
    }

    // Launches the JavaFX application.
    public static void main(String[] args) {
        launch(args);
    }
}