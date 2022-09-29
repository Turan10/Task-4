import java.util.Random;
import java.util.Scanner;


public class GuessANumber {
    private static int rnd_number;


    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess() {
        // Create a Scanner object

        // Read user input


        //use hasNextInt to check if input is numeric,
        // if so...
        //   Compare it with the random number
        //   Let the user know the result of the comparison (was it the right number?)
        //   If it was NOT the rigth number, let the user try again by calling this method recursively
        //   (If you are not sure how to do recursion, you can use a loop instead)

        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        try {
            guess = scanner.nextInt();
        }
        catch (Exception e) {
            System.out.println("Please enter a number");
            makeAGuess();
        }
        if (guess == rnd_number) {
            System.out.println( "You guessed it! What are the odds?!?");
        }
        else if (guess < rnd_number) {
            System.out.println( "Sorry, you are too low. I was thinking of " + rnd_number);
            makeAGuess();
        }
        else {
            System.out.println( "Sorry, that guess is too high. I was thinking of " + rnd_number);
            makeAGuess();
        }
                    }
                }










