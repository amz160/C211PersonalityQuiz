package com.mycompany.personalityquiz;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
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
    private Label progressLabel;
    private List<Button> answerButtons;
    private Button submitButton;
    private Button returnToStartButton;

    @Override
    public void start(Stage stage) {
        assessment = new PersonalityAssessment();
        questions = new Questions().createSampleQuestions();
        currentQuestionIndex = 0;

        Scene welcomeScene = createWelcomeScene(stage);
        stage.setScene(welcomeScene);
        stage.setTitle("Personality Assessment");
        stage.show();
    }

    private Scene createWelcomeScene(Stage stage) {
        // New layout for the welcome screen using VBox
        VBox welcomeLayout = new VBox(20);
        welcomeLayout.setAlignment(Pos.CENTER);
        Label introLabel = new Label("Welcome to the Personality Assessment Quiz!");
        introLabel.setFont(Font.font(24));
        Button startButton = new Button("Take the Quiz");
        startButton.setOnAction(e -> startQuiz(stage));
        welcomeLayout.getChildren().addAll(introLabel, startButton);
        return new Scene(welcomeLayout, 600, 300);
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
            layout.getChildren().removeAll(answerButtons);
            if (progressLabel != null) {
                layout.getChildren().remove(progressLabel);
            }
    
            // Create and add answer buttons
            List<String> answerOptions = currentQuestion.getAnswerOptions();
            for (int i = 0; i < answerOptions.size(); i++) {
                String option = answerOptions.get(i);
                Button answerButton = createAnswerButton(option, layout, stage);
                answerButtons.add(answerButton);
                layout.add(answerButton, 0, i + 1);
                GridPane.setHalignment(answerButton, HPos.CENTER);
            }

            // Add progress indicator label
            progressLabel = new Label("Question " + (currentQuestionIndex + 1) + " of " + questions.size());
            layout.add(progressLabel, 0, answerOptions.size() + 2);
            GridPane.setHalignment(progressLabel, HPos.CENTER);
    
            // Add action listener to submit button
            if (currentQuestionIndex == questions.size() - 1) {
                layout.add(submitButton, 0, answerOptions.size() + 1);
                submitButton.setStyle("-fx-font-weight: bold;");
                GridPane.setHalignment(submitButton, HPos.CENTER);
                submitButton.setOnAction(event -> calculatePersonalityTypeAndDisplayResults(stage));
            }
        }
    }
    
    private Button createAnswerButton(String option, GridPane layout, Stage stage) {
        Button answerButton = new Button(option);
        answerButton.setOnAction(event -> {
            assessment.recordAnswer(questions.get(currentQuestionIndex), option);
            printAnswer(questions.get(currentQuestionIndex), option);
            currentQuestionIndex++; // Increment question index
            displayNextQuestion(layout, stage); // Update UI
        });
        return answerButton;
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