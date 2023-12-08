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
    OPENNESS_TO_EXPERIENCE("Openness to Experience", "Description for openness to experience"),
    INTROVERSION_EXTROVERSION("Introversion/Extroversion", "Description for introversion/extroversion");
    
    private final String name;
    private final String description;

    PersonalityTrait(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}