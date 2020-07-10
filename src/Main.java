import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "What color is my shirt?";
        String choiceOne = "Red";
        String choiceTwo = "Blue";
        String choiceThree = "Green";

        String correctAnswer;
        correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println("Possible Answers are " + choiceOne + "or " + choiceTwo + " or " + choiceThree + ". What's your guess?");
        // Have the user input an answer
        String guess;
        guess = input.next();
        while (!guess.equals(correctAnswer)) {
            System.out.println("Sorry, possible Answers are " + choiceOne + "or " + choiceTwo + " or " + choiceThree + ". What's your guess?");
            guess = input.next();
        }
        System.out.println("You got it.");
        // Retrieve the user's input

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.

    }

}
