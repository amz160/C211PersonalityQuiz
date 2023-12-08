/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personalityquiz;

import java.util.List;

/**
 *
 * @author mario.garcilazo
 */
public class Question {
    
    private final String questionText;
    private final List<String> answerOptions;
    private final String correctAnswer;
    private final PersonalityTrait associatedTrait;

    public Question(String questionText, List<String> answerOptions, String correctAnswer, PersonalityTrait associatedTrait) {
        this.questionText = questionText;
        this.answerOptions = answerOptions;
        this.correctAnswer = correctAnswer;
        this.associatedTrait = associatedTrait;
    }

    public String getQuestionText(){
        return questionText;
    }

    public List<String> getAnswerOptions(){
        return answerOptions;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public PersonalityTrait getAssociatedTrait() {
        return associatedTrait;
    }
    
}
