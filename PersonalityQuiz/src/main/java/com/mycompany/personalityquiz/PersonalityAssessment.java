package com.mycompany.personalityquiz;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mario.garcilazo
 */
public class PersonalityAssessment {

    private final List<Question> questions;
    private final Map<String, PersonalityTrait> personalityTypes;
    private List<TestResult> takenAssessment;

    public PersonalityAssessment() {
        this.questions = new Questions().createSampleQuestions();
        this.personalityTypes = new HashMap<>();
        this.takenAssessment = new ArrayList<>();
    }

    public void addPersonalityType(String personalityType, PersonalityTrait trait) {
        personalityTypes.put(personalityType, trait);
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public List<TestResult> takeAssessment() {
        if (takenAssessment == null) {
            takenAssessment = new ArrayList<>();
        }
        return takenAssessment;
    }

    public void recordAnswer(Question question, String userAnswer) {
        takenAssessment.add(new TestResult(question, userAnswer));
    }

    public String calculatePersonalityType() {
        Map<PersonalityTrait, Integer> traitScores = new HashMap<>();

        // Calculate total scores for each trait
        for (TestResult result : takenAssessment) {
            Question question = result.getQuestion();
            PersonalityTrait trait = question.getAssociatedTrait();
            Map<String, Integer> answerScores = question.getAnswerScores();

            int userScore = answerScores.getOrDefault(result.getAnswer(), 0);
            traitScores.put(trait, traitScores.getOrDefault(trait, 0) + userScore);
        }

        // Find the trait with the highest total score
        int maxScore = 0;
        PersonalityTrait dominantTrait = null;

        for (Map.Entry<PersonalityTrait, Integer> entry : traitScores.entrySet()) {
            if (entry.getValue() > maxScore) {
                maxScore = entry.getValue();
                dominantTrait = entry.getKey();
            }
        }

        // Look up the personality type associated with the dominant trait
        if (dominantTrait != null) {
            return dominantTrait.getDisplayName();
        }

        // Return a default value if no dominant trait is found
        return "Unknown Personality Type";
    }
}