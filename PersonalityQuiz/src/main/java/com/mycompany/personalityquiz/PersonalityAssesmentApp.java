package com.mycompany.personalityquiz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaFX PersonalityAssesmentApp
 */
public class PersonalityAssesmentApp extends Application {

    private PersonalityAssessment assessment;
    private List<Question> questions;
    private int currentQuestionIndex;

    private Label questionLabel;
    private List<Button> answerButtons;
    private Button submitButton;
    private Button returnToStartButton;

    @Override
    public void start(Stage stage) {
        assessment = new PersonalityAssessment();
        questions = new Questions().createSampleQuestions();
        currentQuestionIndex = 0;

        // Create a welcome layout with intro and start button
        BorderPane welcomePane = new BorderPane();
        Label introLabel = new Label("Welcome to the Personality Assessment Quiz!");
        Button startButton = new Button("Take the Quiz");

        // Configure welcome layout elements
        introLabel.setFont(Font.font(24));
        introLabel.setAlignment(Pos.CENTER);

        startButton.setOnAction(e -> startQuiz(stage));

        welcomePane.setTop(introLabel);
        BorderPane.setAlignment(introLabel, Pos.CENTER);
        welcomePane.setCenter(startButton);
        BorderPane.setAlignment(startButton, Pos.CENTER);

        Scene welcomeScene = new Scene(welcomePane, 600, 300);
        stage.setScene(welcomeScene);
        stage.setTitle("Personality Assessment");
        stage.show();
    }

    private void startQuiz(Stage stage) {
        // Initialize GUI components for the quiz
        questionLabel = new Label(); // Display question text
        answerButtons = new ArrayList<>(); // List of answer buttons
        submitButton = new Button("Submit Answer"); // Submit user's answer
        returnToStartButton = new Button("Return to Start");

        // Set layout and add components
        GridPane layout = new GridPane();
        layout.setHgap(10);
        layout.setVgap(10);
        layout.setPadding(new Insets(10));
        layout.setAlignment(Pos.CENTER);

        layout.add(questionLabel, 0, 0);

        // Display the first question
        displayNextQuestion(layout, stage);

        Scene quizScene = new Scene(layout, 600, 400);
        stage.setScene(quizScene);
        stage.setTitle("Personality Assessment - Quiz");
        stage.show();
    }

    private void displayNextQuestion(GridPane layout, Stage stage) {
        if (currentQuestionIndex < questions.size()) {
            Question currentQuestion = questions.get(currentQuestionIndex);
            questionLabel.setText(currentQuestion.getQuestionText());

            // Clear previous answer buttons
            answerButtons.forEach(layout.getChildren()::remove);
            answerButtons.clear();

            // Create and add answer buttons
            List<String> answerOptions = currentQuestion.getAnswerOptions();
            for (int i = 0; i < answerOptions.size(); i++) {
                String option = answerOptions.get(i);
                Button answerButton = new Button(option);
                answerButton.setOnAction(event -> {
                    assessment.recordAnswer(currentQuestion, option);
                    printAnswer(currentQuestion, option);
                    currentQuestionIndex++; // Increment question index
                    displayNextQuestion(layout, stage); // Update UI
                });
                answerButtons.add(answerButton);
                layout.add(answerButton, 0, i + 1);
            }

            // Add action listener to submit button
            if (currentQuestionIndex == questions.size() - 1) {
                layout.add(submitButton, 0, answerOptions.size() + 1);
                submitButton.setOnAction(event -> {
                    calculatePersonalityTypeAndDisplayResults(stage); // Show final results
                });
            }
        }
    }

    private void calculatePersonalityTypeAndDisplayResults(Stage stage) {
        String personalityType = assessment.calculatePersonalityType();
        String description = PersonalityTrait.getDescriptionByType(personalityType);

        VBox resultPane = new VBox(10);
        resultPane.setAlignment(Pos.CENTER);
        Label resultLabel = new Label("Your personality type is: " + personalityType);
        Label descriptionLabel = new Label("Description: " + description);
        Button closeButton = new Button("Close");

        resultLabel.setFont(Font.font(20));
        descriptionLabel.setFont(Font.font(16));

        closeButton.setOnAction(e -> stage.close());
        returnToStartButton.setOnAction(e -> returnToStart(stage));

        resultPane.getChildren().addAll(resultLabel, descriptionLabel, returnToStartButton, closeButton);

        Scene resultScene = new Scene(resultPane, 600, 300);
        stage.setScene(resultScene);
    }

    private void returnToStart(Stage stage) {
        // Reset the quiz to the initial state
        assessment = new PersonalityAssessment();
        questions = new Questions().createSampleQuestions();
        currentQuestionIndex = 0;

        // Display the welcome scene
        start(stage);
    }

    private void printAnswer(Question question, String answer) {
        int questionNumber = questions.indexOf(question) + 1;
        System.out.println("Question " + questionNumber + ": " +
                question.getQuestionText() + " - Answer: " + answer);
    }

    public static void main(String[] args) {
        launch(args);
    }
}