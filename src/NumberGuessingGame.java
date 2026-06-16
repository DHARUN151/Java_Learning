import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Generate random number between 1 and 100
        int randomNumber = rand.nextInt(100) + 1;

        int guess;

        System.out.println("Guess a number between 1 and 100");

        // Loop until correct guess
        while (true) {

            // Check valid integer input
            if (sc.hasNextInt()) {

                guess = sc.nextInt();

                if (guess > randomNumber) {
                    System.out.println("Too High!");
                }

                else if (guess < randomNumber) {
                    System.out.println("Too Low!");
                }

                else {
                    System.out.println("Correct! You guessed the number.");
                    break;
                }

            } else {

                System.out.println("Invalid Input");
                sc.next(); // Remove invalid input
            }
        }

        sc.close();
    }
}