package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab123_While_Guessing_Game {
    public static void main(String[] args) {

        // Guess a number from 1 to 100
        // n = 56
        // 90, number <, 50, number >, 55, -56, -time=9

        Random random = new Random();
        int numberToGuess = random.nextInt(100);
//      System.out.println("numberToGuess")

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int guess;
        int attampts = 0;

        while (true){

            if (!scanner.hasNextInt())
            {
                System.out.println("Invalid input please enter integer number only!");
                scanner.nextInt();
                continue;
            }

            guess = scanner.nextInt();
            attampts++;

            if (guess < numberToGuess)
            {
                System.out.println("To low, Try again!!");
            }
            else if (guess > numberToGuess)
            {
                System.out.println("Too high,Try again!!");
            }
            else
            {
                System.out.println("Correct! You have taken-->"+attampts);
                break;
            }
        }

    }
}
