package com.mycompany.personalityquiz;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
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
    private final List<TestResult> takenAssessment;

    public PersonalityAssessment() {
        this.questions = new ArrayList<>(); // Initialize empty list of questions
        this.personalityTypes = new HashMap<>(); // Initialize empty map of personality types
        this.takenAssessment = new ArrayList<>(); // Initialize empty list of recorded answers
    }

    public void addQuestion(Question question) {
        questions.add(question); // Add question to the list
    }

    public void addPersonalityType(String personalityType, PersonalityTrait trait) {
        personalityTypes.put(personalityType, trait); // Add personality type with its associated trait
    }

    public List<Question> getQuestions() {
        return questions; // Return the list of questions
    }

    public List<TestResult> takeAssessment() {
        return takenAssessment; // Return the list of recorded answers for further analysis
    }

    public String calculatePersonalityType() {
        // Analyze recorded answers and calculate personality type based on associated traits
        // Analyze recorded answers and calculate personality type based on associated traits
        Map<String, Integer> traitCounts = new HashMap<>();

        for (TestResult result : takenAssessment) {
            // String traitName = result.getQuestion().getAssociatedTrait();
            // traitCounts.put(traitName, traitCounts.getOrDefault(traitName, 0) + 1);
        }

        // Find the trait with the highest count
        int maxCount = 0;
        String dominantTrait = null;

        for (Map.Entry<String, Integer> entry : traitCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                dominantTrait = entry.getKey();
            }
        }

        // Look up the personality type associated with the dominant trait
        if (dominantTrait != null) {
            PersonalityTrait personalityTrait = personalityTypes.get(dominantTrait);
            if (personalityTrait != null) {
                return personalityTrait.getName();
            }
        }

        // Return a default value if no dominant trait is found
        return "Unknown Personality Type";
        }
}