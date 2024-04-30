import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main (String[] args) {
        Scanner readingUser = new Scanner(System.in);
        Random random = new Random();
        int rightNumber = random.nextInt(100);
        System.out.println("Try and guess a number between 0 and 100. You have 5 attempts!");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Type your guess: ");
            int numberUser = readingUser.nextInt();
            if (i == 5) {
                System.out.println("And that's 5 attempts. Too bad. Try again some other time.");
            }
            else if (numberUser > rightNumber) {
                int attempts = 5 - i;
                System.out.println("The right number is lower than the one you guessed. You have " + attempts + " attempts.");
            }
            else if (rightNumber > numberUser) {
                int attempts = 5 - i;
                System.out.println("The right number is higher than the one you guessed. You have " + attempts + " attempts.");
            }
            else {
                System.out.println("Congratulations! That's the right number.");
                break;
            }
        }
    }
}
