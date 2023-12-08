package com.mycompany.personalityquiz;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * JavaFX PersonalityAssesmentApp
 */
public class PersonalityAssesmentApp extends Application {



    @Override
    public void start(Stage stage) throws Exception {
        // Create a new PersonalityAssessment object
        PersonalityAssessment assessment = new PersonalityAssessment();

        // Create a new PersonalityAssessmentGUI object
        PersonalityAssessmentGUI gui = new PersonalityAssessmentGUI(assessment);

        // Create and display the scene directly with the GUI instance
        stage.setScene(new Scene(gui));
        stage.setTitle("Personality Assessment");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}