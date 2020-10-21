// Jiyeon Kim
// CS 141
// HW Core Topics: operating the do,while loops wisely
//
// This program will play the Guessing Game with user.
import java.util.*;

public class GuessingGame{

    public static final int max= 10
            ;

    //Main method will repeat the game until user don't want to.
    //This method also call the other methods in proper time.
    public static void main(String[] args){
        Scanner console1 = new Scanner(System.in);
        String continueGame;
        introduction();
        double countGuess;
        double gameCount =0;
        double guessTotal =0;
        double theFewistGuess = max;
        do{
            countGuess= gamePart();
            guessTotal += countGuess;
            theFewistGuess= Math.min(theFewistGuess, countGuess);

            System.out.print("Do you want to play again? ");
            continueGame = console1.next().toUpperCase();
            gameCount++;
            System.out.println(" ");
        } while(continueGame.indexOf("Y") == 0);
        double average = guessTotal / gameCount;
        result(average, gameCount, guessTotal, theFewistGuess);
    }

    //This method introduce the rule of the GuessingGame to the user.
    public static void introduction(){
        System.out.println("This program allows you to play a guessing game.");
        System.out.println("It will think of a number between 1 and "+ max);
        System.out.println("and will allow you to guess until you get the number.");
        System.out.println("For each guess, it will tell you whether you have");
        System.out.println("guessed too high or too low.\n");
    }

    //This method is the major coding of GuessingGame.
    //Here the game is actually played.
    //This method will return the number of guess user did (guessCount).
    public static double gamePart(){
        Scanner console2 = new Scanner(System.in);
        System.out.print("I'm thinking of a number between 1 and " + max);
        System.out.println("...");
        Random rand = new Random();
        int randomAnswer = rand.nextInt(max)+1; // 1~max
        int guess;
        int guessCount = 0;
        do {
            System.out.print("Your Guess? > ");
            guess = console2.nextInt();
            if (guess < randomAnswer) {
                System.out.println("Too Low!");
            } else if (guess > randomAnswer) {
                System.out.println("Too High!");
            }
            guessCount++;
        } while(guess != randomAnswer);
        if(guessCount == 1){
            System.out.println("You got it right on the first guess!!");
        }
        else {
            System.out.print("You got it right in " + guessCount);
            System.out.println(" guesses.");
        }
        return guessCount;
    }

    //This method shows user the statistical result.
    public static void result(double x, double y, double z, double w){
        System.out.println("Game statistics:");
        System.out.println("games           = " + (int) y);
        System.out.println("guesses         = " + (int) z);
        System.out.print("guesses/game      = ");
        System.out.printf("%.1f%n",x);
        System.out.println("fewest guess    = "+ (int) w);
    }
}
/*

This program allows you to play a guessing game.
It will think of a number between 1 and 5
and will allow you to guess until you get the number.
For each guess, it will tell you whether you have
guessed too high or too low.

I'm thinking of a number between 1 and 5...
Your Guess? > 3
Too Low!
Your Guess? > 5
Too High!
Your Guess? > 4
You got it right in 3 guesses.
Do you want to play again? y

I'm thinking of a number between 1 and 5...
Your Guess? > 3
Too High!
Your Guess? > 2
You got it right in 2 guesses.
Do you want to play again? y

I'm thinking of a number between 1 and 5...
Your Guess? > 3
You got it right on the first guess!!
Do you want to play again? Yy

I'm thinking of a number between 1 and 5...
Your Guess? > 5
Too High!
Your Guess? > 2
Too High!
Your Guess? > 1
You got it right in 3 guesses.
Do you want to play again? n

Game statistics:
games           = 4
guesses         = 9
guesses/game      = 2.3
fewest guess    = 1

Process finished with exit code 0

 */