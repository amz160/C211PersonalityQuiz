/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personalityquiz;

/**
 *
 * @author mario.garcilazo
 */
public class TestResult {

    private final Question question;
    private final String userAnswer;
    private final int score; // Score obtained for the user's answer

    public TestResult(Question question, String userAnswer) {
        this.question = question;
        this.userAnswer = userAnswer;
        this.score = calculateScore(); // Calculate score based on answer and question
    }

    private int calculateScore() {
        // Implement logic to calculate score based on user's answer and the correct answer
        // This could involve assigning points based on answer correctness or using other scoring methods
        // ...

        return 0; // Replace with actual calculated score
    }

    public Question getQuestion() {
        return question;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public int getScore() {
        return score;
    }
}
