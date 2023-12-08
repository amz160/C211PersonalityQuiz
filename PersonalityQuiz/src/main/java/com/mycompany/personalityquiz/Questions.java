/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personalityquiz;

/**
 *
 * @author mario.garcilazo
 */
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Questions {

    public List<Question> createSampleQuestions() {
        List<Question> questions = new ArrayList<>();

        // Sample question 1
        Question question1;
        question1 = new Question(
                "Do you actively seek out new social connections or are you content with your existing social circle?",
                List.of("Seek out new connections", "Content with existing circle", "Both"),
                "Both",
                PersonalityTrait.OPENNESS_TO_EXPERIENCE
        );
        questions.add(question1);

        // Sample question 2 (add more as needed)
        Question question2 = new Question(
                "Are you more of an introvert or an extrovert?",
                List.of("Introvert", "Extrovert", "Somewhere in between"),
                "Somewhere in between",
                PersonalityTrait.OPENNESS_TO_EXPERIENCE
        );
        questions.add(question2);
        
        Question question3 = new Question(
                "How do you react in stressful situations?",
                List.of("Stay calm and collected", "Become anxious and worried", "Focus on solving the problem", "Seek help from others"),
                "Stay calm and collected",
                PersonalityTrait.OPENNESS_TO_EXPERIENCE
        );
        questions.add(question3);

        // Add more sample questions as needed

        return questions;
    }
}