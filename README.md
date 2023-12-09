# C211PersonalityQuiz: Personality Assessment
**Team 2:** Amstrong Akendung, Mario Garcilazo, and Alyssa Martinez  

## Description
This project implements a Java-based personality quiz to determine a user's personality type. It presents users with questions, analyzes their answers, and concludes their personality type.

## Class Structure
* **PersonalityAssessmentApp (Main Application Class):**
  * Responsible for initializing the JavaFX application.
  * Manages the stages and scenes for the welcome, quiz, and result screens.
  * Handles user interactions and displays relevant information.
* **Personality:**
  * Represents a person's personality; storing answers.
  * Represents the backend of the personality assessment.
  * Stores a list of questions and personality types.
  * Records user answers and calculates the dominant personality trait.
* **Question:**
  * Defines a question in the personality quiz.
  * Includes the question text, answer options, associated trait, and answer scores.
* **Questions:**
  * Provides a utility class for creating a sample set of questions for the quiz.
* **TestResult:**
  * Represents a user's response to a specific question.
  * Associates a question, selected answer, and score.
* **PersonalityTrait (Enum):**
  * Enumerates various personality traits with display names and descriptions.


## Screenshots
![image](https://github.com/amz160/C211PersonalityQuiz/assets/147431750/66ff234b-386f-4f1c-831d-8ef7772e454c)
![image](https://github.com/amz160/C211PersonalityQuiz/assets/147431750/f970c61f-78bc-4f78-9657-bbc2a9c1ca64)
![image](https://github.com/amz160/C211PersonalityQuiz/assets/147431750/67c1f153-159a-4d94-bb34-3aaed5b3a967)
![image](https://github.com/amz160/C211PersonalityQuiz/assets/147431750/29a0a161-fdf9-4b80-812b-4e219d1863b2)



