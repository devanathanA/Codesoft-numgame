package deva;
import java.util.Random;
import java.util.Scanner;

class Game {
    private int numberToGuess;
    private int attempts;
    private int maxAttempts;

    public Game(int maxAttempts) {
        Random random = new Random();
        numberToGuess = random.nextInt(100) + 1;
        attempts = 0;
        this.maxAttempts = maxAttempts;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number  Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        while (attempts < maxAttempts) {
            System.out.print("Take guess no " + (attempts + 1) + ": "); 
            int guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                scanner.close();
                return;
            }
        }

        System.out.println("Sorry, you've reached the maximum number of attempts.");
        System.out.println("The number I thinking of was: " + numberToGuess);
        scanner.close();
    }
}

public class Task_1_NUmber_Game {
    public static void main(String[] args) {
        int maxAttempts = 5; 
     	Game Game = new Game(maxAttempts);
        Game.play();
    }
}