package Lab1_Problems;

import java.util.Scanner;
import java.util.*;

public class Bonus {


            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                List<Double> numbers = new ArrayList<>();
                List<String> operations = new ArrayList<>();

                // Getting the first number from the user
                System.out.print("Enter number: ");
                numbers.add(scanner.nextDouble());

                while (true) {
                    System.out.print("Enter operation symbol +, -, *, / or = to calculate: ");
                    String operation = scanner.next();

                    if (operation.equals("=")) {
                        break;  // Exit the loop and calculate the result when entered =
                    }

                    operations.add(operation);  // Store the operation for consequently calculation

                    System.out.print("Enter number: ");
                    numbers.add(scanner.nextDouble());  // Add the next number to calculate
                }

                // Calculate the result using BEDMAS rule
                double result = calculate(numbers, operations);
                System.out.println("Result: " + result); //result will be printed.

            }

    private static double calculate(List<Double> numbers, List<String> operations) {
        // Calculate multiplication and division first
        for (int i = 0; i < operations.size(); i++) {
            if (operations.get(i).equals("*") || operations.get(i).equals("/")) {
                double num1 = numbers.get(i);
                double num2 = numbers.get(i + 1);
                double intermediateResult = operations.get(i).equals("*") ? num1 * num2 : num1 / num2;

                // Replace numbers and operations for next calculations
                numbers.set(i, intermediateResult);
                numbers.remove(i + 1);
                operations.remove(i);
                i--; // Adjust index after removal
            }
        }

        // Calculate addition and subtraction later
        double result = numbers.get(0);
        for (int i = 0; i < operations.size(); i++) {
            if (operations.get(i).equals("+")) {
                result += numbers.get(i + 1);
            } else if (operations.get(i).equals("-")) {
                result -= numbers.get(i + 1);
            }
        }

        return result; // return result
            }
    }

/*

Sure! Here’s an even simpler breakdown of the Java code, focusing on basic concepts and avoiding technical jargon:

Simplified Explanation
public static void main(String[] args) {

    This is where the program starts.
    Scanner scanner = new Scanner(System.in);

    This creates a tool to read user input from the keyboard.
            List<Double> numbers = new ArrayList<>();

    This creates a list to store the numbers the user enters.
            List<String> operations = new ArrayList<>();

    This creates a list to store the operations (like +, -, *, /) the user wants to perform.
            System.out.print("Enter number: ");

    Asks the user to type a number.
            numbers.add(scanner.nextDouble());

    Takes the number the user typed and saves it in the list.
    while (true) {

        Starts a loop that will run forever until we tell it to stop.
                System.out.print("Enter operation symbol +, -, *, / or = to calculate: ");

        Asks the user to enter an operation or "=" to calculate.
        String operation = scanner.next();

        Saves the operation the user typed.
        if (operation.equals("=")) { break; }

        If the user typed "=", it stops the loop.
                operations.add(operation);

        Saves the operation in the list.
        System.out.print("Enter number: ");

        Asks for another number.
        numbers.add(scanner.nextDouble());

        Saves the new number in the list.
        double result = calculate(numbers, operations);

        Calls a helper function to calculate the final result using the numbers and operations.
        System.out.println("Result: " + result);

        Shows the final result to the user.
        The calculate Method
        private static double calculate(List<Double> numbers, List<String> operations) {

            This is a separate part of the program that does the math.
            for (int i = 0; i < operations.size(); i++) {

                Goes through each operation one by one.
                if (operations.get(i).equals("*") || operations.get(i).equals("/")) {

                    Checks if the operation is multiplication or division.
                    double num1 = numbers.get(i);

                    Gets the first number for the operation.
                    double num2 = numbers.get(i + 1);

                    Gets the second number for the operation.
                    double intermediateResult = operations.get(i).equals("*") ? num1 * num2 : num1 / num2;

                    If the operation is "*", it multiplies the numbers. If it's "/", it divides them.
                    numbers.set(i, intermediateResult);

                    Puts the result back in the list, replacing the first number.
                            numbers.remove(i + 1);

                    Removes the second number from the list since it's already used.
                    operations.remove(i);

                    Removes the operation from the list.
                    i--;

                    Adjusts the index so the loop works correctly after removing items.
                    double result = numbers.get(0);

                    Starts the result with the first number.
                    for (int i = 0; i < operations.size(); i++) {

                        Goes through the remaining operations for addition and subtraction.
                        if (operations.get(i).equals("+")) { result += numbers.get(i + 1); }

                        If the operation is "+", adds the next number to the result.
else if (operations.get(i).equals("-")) { result -= numbers.get(i + 1); }

                        If the operation is "-", subtracts the next number from the result.
                        return result;

                        Sends the final result back to where it was called.
                                Summary
                        This program is a basic calculator. It lets the user enter numbers and operations (like adding or subtracting). The program follows the correct order for calculations and then shows the final result.







*/
