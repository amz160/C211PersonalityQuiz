/**
 * Author: Mario Garcilazo
 * Team: Team 2
 * Date: 11/13/23
 * Class Description: This class represents a question in a personality assesment. 
 */

public class Question{

    private String QuestionText;

    private List<String> answerOptions;

    private String correctAnswer;

    private personalityTrait personalityTrait;

    /**
     * Constructor for the Question class.
     *
     * Returns the following:
     *      The text of the question.
     *      A list of possible answer options for the question.
     *      The correct answer to the question.
     *      The personality trait associated with the question.
     */
    public Question(String questionText, List<String> answerOptions, String correctAnswer, PersonalityTrait personalityTrait) {

    }

    /**
     * Gets the text of the question.
     *
     * Returns the text of the question.
     */
    public String getQuestionText() {
        return questionText;
    }

    /**
     * Sets the text of the question.
     *
     * REturns the text of the question.
     */
    public void setQuestionText(String questionText) {

    }

    /**
     * Gets the list of possible answer options.
     *
     * return the list of possible answer options.
     */
    public List<String> getAnswerOptions() {
    }

    /**
     * Sets the list of possible answer options.
     *
     * Returns the list of possible answer options.
     */
    public void setAnswerOptions(List<String> answerOptions) {
    }

    /**
     * Gets the correct answer to the question.
     *
     * return the correct answer to the question.
     */
    public String getCorrectAnswer() {

    }

    /**
     * Sets the correct answer to the question.
     *
     * Returns the correct answer to the question.
     */
    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    /**
     * Gets the personality trait associated with the question.
     *
     * return he personality trait associated with the question.
     */
    public PersonalityTrait getPersonalityTrait() {
    }

    /**
     * Sets the personality trait associated with the question.
     *
     * Returns the personality trait associated with the question.
     */
    public void setPersonalityTrait(PersonalityTrait personalityTrait) {
        
    }

    /**
     * Returns a string representation of the Question object.
     *
     *  A string representation of the Question object.
     */
    public String toString() {
    }



}