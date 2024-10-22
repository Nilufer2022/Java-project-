package Lab1_Problems;
import java.util.Scanner;


public class Promlem4_Calculator {
    public static void main(String[] args) {

        /*
Problem 4
        • Command line calculator
• Get one double from user eq 12
        • Get one opera7on symbol eq +
        • Get one another double from user eq 92
        • User enters = sign and compute the result;
Bonus:
User can enter as many numbers and opera7on symbols as they want.
Eg:
enter number: 5
enter opr : *
enter number 6
enter opr: +
enter number: 12
enter opr: =
*/
        Scanner scanner = new Scanner(System.in);
        double result = 0; // result, as double
        String operation = ""; // operation symbol from the user entry, string.

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble(); // Get the first number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble(); // Get the first number

        while (true) { // Loop to keep asking for operations and numbers
            System.out.print("Enter an operation symbol  (+, -, *, /) or = to calculate: ");
            operation = scanner.next(); // Get the operation

            if (operation.equals("=")) {
                // If the user enters '=', break the loop
                break;
            }

            // Perform the operation
            switch (operation) {
                case "+":
                    result = num1+num2; // Add the numbers
                    break;
                case "-":
                    result = Math.abs(num1-num2); // Subtract the numbers
                    break;
                case "*":
                    result = num1*num2; // Multiply the numbers
                    break;
                case "/":
                    if (num2 != 0) {
                        result =num1/num2; // Divide the numbers
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Please enter  +, -, *, / = symbols");
            }
        }

        // Output the  result variable.
        System.out.println("The result is: " + result);

    }
}
