/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personalityquiz;

import java.util.List;
import java.util.Map;

/**
 *
 * @author mario.garcilazo
 */
public class Question {
    
    private String questionText;
    private List<String> answerOptions;
    private Map<String, Integer> answerScores;
    private PersonalityTrait associatedTrait;

    public Question(String questionText, List<String> answerOptions, Map<String, Integer> answerScores, PersonalityTrait associatedTrait) {
        this.questionText = questionText;
        this.answerOptions = answerOptions;
        this.answerScores = answerScores;
        this.associatedTrait = associatedTrait;
    }

    public String getQuestionText(){
        return questionText;
    }

    public List<String> getAnswerOptions(){
        return answerOptions;
    }



    public PersonalityTrait getAssociatedTrait() {
        return associatedTrait;
    }
    
     public Map<String, Integer> getAnswerScores() {
        return answerScores;
    }
    
}
