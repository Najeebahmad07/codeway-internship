import java.util.Random;
import java.util.Scanner;

public class number_game {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Random random = new Random();

int minRange = 1;
int maxRange = 5;
int maxattempts = 10;


int score = 0;
System.out.println("Welcome to the Number Guessing Game");

do {
        int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int attempts = 0;
        boolean guess = false;

        System.out.println("\nGuess the number between " + minRange + " and " + maxRange + ".");

        while (attempts < maxattempts && !guess) {
        System.out.print("Enter your guess: ");
        int userGuess = scanner.nextInt();
        attempts++;

    if (userGuess == targetNumber) {
    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
    guess = true;
    score++;
    }
    else if (userGuess < targetNumber) {
    System.out.println("Too low! Try again.");
    }
     else {
    System.out.println("Too high! Try again.");

}
 }

if (!guess) {
    System.out.println("Sorry! You've reached the maximum number of attempts.: "+ targetNumber);

}

 System.out.print("\nDo you want to play again? (yes/no): ");
String playAgain = scanner.next().toLowerCase();

if (playAgain.equals("no")) {
System.out.println("\nThanks for playing! Your final score is: " + score);
break;

}

        } while (true);

        scanner.close();
    }
}
