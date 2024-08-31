import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        boolean playagain = true;
        System.out.println("Welcome to the Game");
        while (playagain) {
            int guess_Value = random.nextInt(100) + 1;
            int attempts = 0;
            int max_attempts = 5;
            System.out.println("you have a random number from 1 to 100 in the given 5 attempts");
            while (attempts < max_attempts) {
                System.out.print("Guess the number:");
                int guess_number = myscan.nextInt();
                myscan.nextLine();
                attempts++;
                if (guess_Value == guess_number) {
                    System.out.println("Congratulations you guess correctly");
                    score++;
                } else if (guess_Value != guess_number) {
                    System.out.println("Sorry better luck next time");
                    if (guess_Value > guess_number) {
                        System.out.println("your guess is too long");
                    } else if (guess_Value < guess_number) {
                        System.out.println("your guess is too short");
                    } else {
                        System.out.println();
                    }
                } else {
                    System.out.println("sorry you attempts are completed");
                }

            }
            if (attempts >= max_attempts) {
                System.out.println("Sorry,you have run out of the attempts");
            }
            System.out.println("Do you want to play again? (YES/NO)");
            String playagainInput = myscan.nextLine();
            playagain = playagainInput.equalsIgnoreCase("yes");

        }
        System.out.print("Game over,your final score is:");
        System.out.println(score);
    }
}