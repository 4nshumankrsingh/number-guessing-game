import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int guess;
        int min = 0;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);
        int attempts = 0;

        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1-100");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess > randomNumber) {
                System.out.println("Too High! Take another guess.");
            }
            else if (guess < randomNumber) {
                System.out.println("Too Low! Take another guess.");
            }
            else {
                System.out.printf("Correct! The number was %d\n", guess);
                System.out.printf("# of attempts taken: %d\n", attempts);
                
            }
        } while (guess != randomNumber);

        System.out.printf("You won");
    }
}

