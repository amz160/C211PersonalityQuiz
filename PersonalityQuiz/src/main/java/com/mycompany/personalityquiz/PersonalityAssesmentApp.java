package com.mycompany.personalityquiz;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.List;

/**
 * JavaFX PersonalityAssesmentApp
 */
public class PersonalityAssesmentApp extends Application {

    private PersonalityAssessment assessment;
    private List<Question> questions;
    private int currentQuestionIndex;

    private Label questionLabel;
    private ComboBox<String> answerOptionsComboBox;
    private Button submitButton;
    private TextArea resultsTextArea;

    @Override
    public void start(Stage stage) {
        assessment = new PersonalityAssessment();
        questions = new Questions().createSampleQuestions();
        currentQuestionIndex = 0;

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
        startButton.setOnAction(e -> startQuiz(stage));

        welcomePane.getChildren().addAll(introLabel, startButton);

        Scene welcomeScene = new Scene(welcomePane, 600, 300);
        stage.setScene(welcomeScene);
        stage.setTitle("Personality Assessment");
        stage.show();
    }

    private void startQuiz(Stage stage) {
        // Initialize GUI components for the quiz
        questionLabel = new Label(); // Display question text
        answerOptionsComboBox = new ComboBox<>(); // List of answer options
        submitButton = new Button("Submit Answer"); // Submit user's answer
        resultsTextArea = new TextArea(); // Display final personality type
        resultsTextArea.setEditable(false); // Make results area read-only

        // Set layout and add components
        GridPane layout = new GridPane();
        layout.setHgap(10);
        layout.setVgap(10);

        layout.add(questionLabel, 0, 0);
        layout.add(answerOptionsComboBox, 1, 0);
        layout.add(submitButton, 2, 0);
        layout.add(resultsTextArea, 0, 1, 3, 1);

        // Set initial content
        resultsTextArea.setText(""); // Clear any existing text

        // Set initial focus on answer options combo box
        answerOptionsComboBox.requestFocus();

        // Add action listener to submit button
        submitButton.setOnAction(event -> {
            // Get user's answer from combo box
            String userAnswer = answerOptionsComboBox.getSelectionModel().getSelectedItem();

            // Record answer in assessment
            assessment.takeAssessment().add(new TestResult(
                    questions.get(currentQuestionIndex), userAnswer));

            // Check if all questions answered
            if (currentQuestionIndex < questions.size() - 1) {
                currentQuestionIndex++; // Increment question index
                displayNextQuestion(); // Update UI
            } else {
                calculatePersonalityTypeAndDisplayResults(); // Show final results
            }
        });

        // Display the first question
        displayNextQuestion();

        Scene quizScene = new Scene(layout, 600, 300);
        stage.setScene(quizScene);
        stage.setTitle("Personality Assessment - Quiz");
        stage.show();
    }

    private void displayNextQuestion() {
        Question currentQuestion = questions.get(currentQuestionIndex);
        questionLabel.setText(currentQuestion.getQuestionText());

        answerOptionsComboBox.getItems().clear();
        answerOptionsComboBox.getItems().addAll(currentQuestion.getAnswerOptions());
    }

    private void calculatePersonalityTypeAndDisplayResults() {
        String personalityType = assessment.calculatePersonalityType();
        resultsTextArea.clear();
        resultsTextArea.setText("Your personality type is: " + personalityType);
    }

    public static void main(String[] args) {
        launch(args);
    }
}