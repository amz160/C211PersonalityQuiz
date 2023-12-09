/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personalityquiz;

/**
 *
 * @author mario.garcilazo
 */

public enum PersonalityTrait {
    RESILIENCE("Resilience", "The ability to bounce back from setbacks and remain positive."),
    SOCIALADAPTABILITY("Social Adaptability", "The ease with which you adjust to various social situations."),
    SOCIALCONFIDENCE("Social Confidence", "The level of assurance in social interactions and gatherings."),
    OPENNESSTOEXPERIENCE("Openness to Experience", "The willingness to explore new ideas and embrace change."),
    FLEXIBILITY("Flexibility", "The ability to adapt and adjust to changing circumstances."),
    EMOTIONALINTELLIGENCE("Emotional Intelligence", "The capability to recognize and manage emotions effectively."),
    MENTALTOUGHNESS("Mental Toughness", "The resilience to cope with challenges and pressure."),
    EMOTIONALAUTHENTICITY("Emotional Authenticity", "The degree to which you express genuine emotions."),
    EMOTIONALINDEPENDENCE("Emotional Independence", "The ability to maintain emotional autonomy."),
    PERSPECTIVEANDGROWTHMINDSET("Perspective and Growth Mindset", "The tendency to focus on positive aspects and embrace personal growth."),
    DECISIONMAKINGSTYLE("Decision-Making Style", "The approach you take in making choices, whether analytical or intuitive."),
    DECISIONMAKINGSPEED("Decision-Making Speed", "The pace at which you make decisions, whether quickly or thoughtfully."),
    RISKTOLERANCE("Risk Tolerance", "The comfort level with taking risks and making impulsive choices."),
    ADAPTABILITY("Adaptability", "The capacity to adjust to different environments and situations.");

    private String displayName;
    private String description;

    PersonalityTrait(String displayName, String description) {
        this.displayName = displayName;
        this.description = description;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDescription() {
        return description;
    }
    
    // New method to get description by personality type
    public static String getDescriptionByType(String personalityType) {
        for (PersonalityTrait trait : values()) {
            if (trait.displayName.equals(personalityType)) {
                return trait.description;
            }
        }
        return "No description available.";
    }
}
