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
        // ... Implement logic to identify dominant personality type ...

        // Return the calculated personality type
        return "Personality type"; // Replace with actual calculation result
    }
}