import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        int rounds = 3;

        System.out.println("Welcome to the Guess the Number game!");

        for (int round = 1; round <= rounds; round++) {
            System.out.println("\nRound " + round + " of " + rounds);
            int numberToGuess = random.nextInt(100) + 1; 
            int attempts = 0;
            int maxAttempts = 5;
            boolean hasGuessed = false;

            while (attempts < maxAttempts && !hasGuessed) {
                System.out.print("Enter your guess (1-100): ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < numberToGuess) {
                    System.out.println("The number is higher than " + userGuess);
                } else if (userGuess > numberToGuess) {
                    System.out.println("The number is lower than " + userGuess);
                } else {
                    System.out.println("Congratulations! You guessed the number.");
                    hasGuessed = true;
                }
            }

            if (!hasGuessed) {
                System.out.println("Sorry! You've used all attempts. The number was: " + numberToGuess);
            }

            int pointsEarned = hasGuessed ? (maxAttempts - attempts + 1) * 10 : 0;
            score += pointsEarned;
            System.out.println("You earned " + pointsEarned + " points this round.");
            System.out.println("Your total score is: " + score);
        }

        System.out.println("\nGame Over!");
        System.out.println("Your final score is: " + score);
        scanner.close();
    }
}
