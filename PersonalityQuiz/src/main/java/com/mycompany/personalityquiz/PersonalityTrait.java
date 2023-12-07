/**
 * Author: Alyssa Martinez
 * Team: Team 2
 * Date: 12/06/23
 * Class Description: This class represents a personality trait in a personality assessment. 
 * It stores the name and description of a personality trait.
 */

public class PersonalityTrait {
    private String name;
    private String description;

    /**
     * Constructor for the PersonalityTrait class.
     */
    public PersonalityTrait(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * Gets the name of the personality trait.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the personality trait.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the description of the personality trait.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the personality trait.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns a string representation of the PersonalityTrait object.
     */
    @Override
    public String toString() {
        return "PersonalityTrait{" +
               "name='" + name + '\'' +
               ", description='" + description + '\'' +
               '}';
    }
}
