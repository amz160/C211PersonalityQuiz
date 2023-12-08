package com.mycompany.personalityquiz;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


/**
 * JavaFX PersonalityAssesmentApp
 */
public class PersonalityAssesmentApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // Create a new PersonalityAssessment object
        PersonalityAssessment assessment = new PersonalityAssessment();

        // Create a welcome layout with intro and start button
        Pane welcomePane = new Pane();
        Label introLabel = new Label("Welcome to the Personality Assessment Quiz!");
        Button startButton = new Button("Take the Quiz");

        // Configure welcome layout elements
        introLabel.setFont(Font.font(24));
        introLabel.setLayoutX(50);
        introLabel.setLayoutY(100);

        startButton.setLayoutX(250);
        startButton.setLayoutY(200);
        startButton.setOnAction(e -> {
            // Create PersonalityAssessmentGUI and switch scene
            PersonalityAssessmentGUI gui = new PersonalityAssessmentGUI();
            Scene scene = gui.getScene();
            stage.setScene(scene);
        });

        welcomePane.getChildren().addAll(introLabel, startButton);

        Scene scene = new Scene(welcomePane, 600, 300);
        stage.setScene(scene);
        stage.setTitle("Personality Assessment");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

