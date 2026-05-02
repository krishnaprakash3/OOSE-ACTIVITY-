import java.util.Random;
import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        Random r = new Random();
        boolean playAgain = true;
        int score = 0,GuessingNo,attempts,Maxattempts;
        while (playAgain) {
             GuessingNo = r.nextInt(100) + 1;
             attempts = 0;
             Maxattempts = 10;
            boolean guessedCorrectly = false;
            System.out.println("Guess the number between 1 to 100 (You have " + Maxattempts + " attempts):");
            while (attempts < Maxattempts && !guessedCorrectly) {
                attempts++;
                System.out.print("Attempt " + attempts + ": ");
                int userGuess = o.nextInt();
                if (userGuess < GuessingNo) {
                    System.out.println("guess is low!");

                } else if (userGuess > GuessingNo) {
                  System.out.println("guess is high!");
                } else {
                    System.out.println("perfect! You guessed the number correctly.");
                    guessedCorrectly = true;
                }
            }
            if (!guessedCorrectly) {
                System.out.println("Sorry,attempts were excided. The number was: " + GuessingNo);
            } 
            score=(Maxattempts-attempts);
            System.out.println("Your score: " + score);
            System.out.print("Do you want to play again?(yes/no): ");
            playAgain = o.next().equalsIgnoreCase("yes");
        }
         o.close();
    }    
}
return 0;
