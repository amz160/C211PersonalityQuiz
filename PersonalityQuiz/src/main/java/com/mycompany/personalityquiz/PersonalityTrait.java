/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personalityquiz;

/**
 *
 * @author mario.garcilazo
 */
public class PersonalityTrait {

    private final String name;
    private final String description;

    public PersonalityTrait(String name, String description)
 
{
        this.name = name;
        this.description = description;
    }

    public String getName()
 
{
        return name;
    }

    public String getDescription()
 
{
        return description;
    }
}