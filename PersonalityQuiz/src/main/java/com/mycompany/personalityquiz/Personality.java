/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personalityquiz;

/**
 *
 * @author mario.garcilazo
 */
public class Personality {

    private final String name;
    private final String description;
    private final int score;

    public Personality(String name, String description, int score)
 
{
        this.name = name;
        this.description = description;
        this.score = score;
    }

    public String getName()
 
{
        return name;
    }

    public String getDescription()
 
{
        return description;
    }

    public int getScore(){
        return score;
    }
}
