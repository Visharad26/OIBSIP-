import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(101); // generate a random number between 0 and 100
        int guess = -1; // initialize guess to a value outside of the valid range

        System.out.println("Guess the secret number between 0 and 100!");

        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("Your guess is too low. Try again!");
            } else if (guess > secretNumber) {
                System.out.println("Your guess is too high. Try again!");
            } else {
                System.out.println("Congratulations! You guessed the secret number.");
            }
        }

        scanner.close();
    }
}
