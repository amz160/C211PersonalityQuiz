/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personalityquiz;

/**
 *
 * @author mario.garcilazo
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Questions {

    public List<Question> createSampleQuestions() {
        List<Question> questions = new ArrayList<>();

        // Question 1
        Question question1 = new Question(
            "How do you react in stressful situations?",
            List.of("Stay calm and collected", "Become anxious and worried", "Focus on solving the problem", "Seek help from others"),
            Map.of(
                "Stay calm and collected", 5,
                "Become anxious and worried", 2,
                "Focus on solving the problem", 4,
                "Seek help from others", 3
            ),
            PersonalityTrait.RESILIENCE
        );
        questions.add(question1);

        // Question 2
        Question question2 = new Question(
            "Do you prefer spending time alone or with others?",
            List.of("Alone", "With others", "It depends on the situation"),
            Map.of(
                "Alone", 3,
                "With others", 5,
                "It depends on the situation", 4
            ),
            PersonalityTrait.SOCIALADAPTABILITY
        );
        questions.add(question2);

        // Question 3
        Question question3 = new Question(
            "How comfortable are you in large social gatherings?",
            List.of("Very comfortable", "Somewhat comfortable", "Not very comfortable", "Not at all comfortable"),
            Map.of(
                "Very comfortable", 5,
                "Somewhat comfortable", 4,
                "Not very comfortable", 2,
                "Not at all comfortable", 1
            ),
            PersonalityTrait.SOCIALCONFIDENCE
        );
        questions.add(question3);

        // Question 4
        Question question4 = new Question(
            "Do you actively seek out new social connections or are you content with your existing social circle?",
            List.of("Seek out new connections", "Content with existing circle", "Both"),
            Map.of(
                "Seek out new connections", 5,
                "Content with existing circle", 3,
                "Both", 4
            ),
            PersonalityTrait.OPENNESSTOEXPERIENCE
        );
        questions.add(question4);

        // Question 5
        Question question5 = new Question(
            "Do you prefer spontaneous social activities or planned events?",
            List.of("Spontaneous", "Planned", "Either is good"),
            Map.of(
                "Spontaneous", 4,
                "Planned", 3,
                "Either is good", 5
            ),
            PersonalityTrait.FLEXIBILITY
        );
        questions.add(question5);

        // Question 6
        Question question6 = new Question(
            "How well do you handle difficult emotions?",
            List.of("Very well", "Somewhat well", "Not very well", "Not at all well"),
            Map.of(
                "Very well", 5,
                "Somewhat well", 4,
                "Not very well", 2,
                "Not at all well", 1
            ),
            PersonalityTrait.EMOTIONALINTELLIGENCE
        );
        questions.add(question6);

        // Question 7
        Question question7 = new Question(
            "Are you generally optimistic or pessimistic?",
            List.of("Optimistic", "Pessimistic", "Neutral"),
            Map.of(
                "Optimistic", 5,
                "Pessimistic", 2,
                "Neutral", 3
            ),
            PersonalityTrait.MENTALTOUGHNESS
        );
        questions.add(question7);

        // Question 8
        Question question8 = new Question(
            "Do you tend to express your emotions openly or keep them bottled up?",
            List.of("Express openly", "Keep them bottled up", "Express to trusted individuals"),
            Map.of(
                "Express openly", 4,
                "Keep them bottled up", 2,
                "Express to trusted individuals", 5
            ),
            PersonalityTrait.EMOTIONALAUTHENTICITY
        );
        questions.add(question8);

        // Question 9
        Question question9 = new Question(
            "Are you easily influenced by the emotions of others?",
            List.of("Yes, very easily", "Somewhat", "Not very", "Not at all"),
            Map.of(
                "Yes, very easily", 3,
                "Somewhat", 4,
                "Not very", 2,
                "Not at all", 1
            ),
            PersonalityTrait.EMOTIONALINDEPENDENCE
        );
        questions.add(question9);

        // Question 10
        Question question10 = new Question(
            "Do you prefer to focus on the positive aspects of life or do you tend to dwell on the negative?",
            List.of("Positive", "Negative", "Both"),
            Map.of(
                "Positive", 5,
                "Negative", 2,
                "Both", 4
            ),
            PersonalityTrait.PERSPECTIVEANDGROWTHMINDSET
        );
        questions.add(question10);

        // Question 11
        Question question11 = new Question(
            "Do you rely on logic and analysis when making decisions, or intuition and gut feeling?",
            List.of("Logic and analysis", "Intuition and gut feeling", "Both"),
            Map.of(
                "Logic and analysis", 4,
                "Intuition and gut feeling", 3,
                "Both", 5
            ),
            PersonalityTrait.DECISIONMAKINGSTYLE
        );
        questions.add(question11);

        // Question 12
        Question question12 = new Question(
            "Do you prefer to make decisions quickly or take your time to consider all options?",
            List.of("Quickly", "Take my time", "It depends on the decision"),
            Map.of(
                "Quickly", 5,
                "Take my time", 3,
                "It depends on the decision", 4
            ),
            PersonalityTrait.DECISIONMAKINGSPEED
        );
        questions.add(question12);

        // Add more sample questions as needed

        return questions;
    }
}