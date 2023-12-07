/**
 * Author: Alyssa Martinez
 * Team: Team 2
 * Date: 12/06/23
 * Class Description: This class represents a person's personality in a personality assessment.
 * It stores details such as the name, age, gender, and personality type of a person.
 */

package com.mycompany.personalityquiz;

public class Personality {
    private String name;
    private int age;
    private String gender;
    private String personalityType;

    /**
     * Gets the name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the age of the person.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the person.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the gender of the person.
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender of the person.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets the personality type of the person.
     */
    public String getPersonalityType() {
        return personalityType;
    }

    /**
     * Sets the personality type of the person.
     */
    public void setPersonalityType(String personalityType) {
        this.personalityType = personalityType;
    }

    /**
     * Returns a string representation of the Personality object.
     */
    @Override
    public String toString() {
        return "Personality{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", gender='" + gender + '\'' +
               ", personalityType='" + personalityType + '\'' +
               '}';
    }
}
