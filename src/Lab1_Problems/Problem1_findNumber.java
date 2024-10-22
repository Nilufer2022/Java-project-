package Lab1_Problems;

import java.util.Scanner;
import java.util.Random;
/*Problem	1
Write a program that randomly generates an
integer between 0 and 100, inclusive. The
program prompts the user to enter a number
continuously until the number matches the
randomly generated number. For each user input,
the program tells the user whether the input is
too low or too high, so the user can choose the
next input intelligently.*/


public class Problem1_findNumber {
    public static void main(String[] args) {

        int targetNumber = (int) (Math.random() * 100); // Generates a number between 0 and 100

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to get user input
        int number = -1; // number initialized with a value out of 0 to 100.

        System.out.println("Enter a number between 0 and 100.");  //Asks user to enter input 0-100.



        // Using while loop ask user enter number till number=TargetNumber
        while (number != targetNumber) {
            System.out.print("Enter your number: ");
            number = scanner.nextInt();


            if (0 <= number && number <= 100) {    // Only numbers 0 tp 100

                // Check if the number is too low, too high, or correct
                if (number < targetNumber) {
                    System.out.println("..Too low!");
                } else if (number > targetNumber) {
                    System.out.println("..Too high!");
                } else {
                    System.out.println("Congratulations! You found the number: " + targetNumber);
                }
            } else {

                System.out.println("Please enter a valid integer between 0-100."); // Warn user if entered other than 0 to 100

            }
        }

    }
}
