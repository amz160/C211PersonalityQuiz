/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personalityquiz;

import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;

import java.util.List;


/**
 *
 * @author mario.garcilazo
 */
public class PersonalityAssessmentGUI extends Parent{

    private final PersonalityAssessment assessment;
    private final List<Question> questions;

    private final Label questionLabel;
    private ComboBox<String> answerOptionsComboBox;
    private final Button submitButton;
    private final TextArea resultsTextArea;

    private int currentQuestionIndex; // Track current question

    public PersonalityAssessmentGUI() {
        this.assessment = new PersonalityAssessment();
        this.questions = new Questions().createSampleQuestions();
        this.currentQuestionIndex = 0;

        // Initialize GUI components
        questionLabel = new Label(); // Display question text
        answerOptionsComboBox = new ComboBox<>(); // List of answer options
        submitButton = new Button("Submit Answer"); // Submit user's answer
        resultsTextArea = new TextArea(); // Display final personality type
        resultsTextArea.setEditable(false); // Make results area read-only

        // Set layout and add components
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
                Platform.runLater(() -> displayNextQuestion()); // Update UI on FX thread
            } else {
                Platform.runLater(() -> calculatePersonalityTypeAndDisplayResults()); // Show final results on FX thread
            }
        });

        // Display the first question
        Platform.runLater(() -> displayNextQuestion());
       
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
}