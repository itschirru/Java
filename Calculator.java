import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true; // Controls the loop to keep the calculator running

        while (keepRunning) {
            // Taking user input for numbers
            System.out.print("Enter the first number: ");
            double f = sc.nextDouble();

            System.out.print("Enter the second number: ");
            double s = sc.nextDouble();

            // Display operation choices
            System.out.println("Choose an operation:");
            System.out.println("1 - Addition");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            System.out.println("5 - Exit");

            int condition = sc.nextInt(); // User choice

            // Performing the selected operation
            switch (condition) {
                case 1:
                    System.out.println("Result: " + (f + s)); // Addition
                    break;
                case 2:
                    System.out.println("Result: " + (f - s)); // Subtraction
                    break;
                case 3:
                    System.out.println("Result: " + (f * s)); // Multiplication
                    break;
                case 4:
                    if (s == 0) {
                        System.out.println("Error: Division by zero is not allowed."); // Prevent division by zero
                    } else {
                        System.out.println("Result: " + (f / s)); // Division
                    }
                    break;
                case 5:
                    keepRunning = false; // Exit condition
                    System.out.println("Exiting calculator...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5."); // Handles invalid inputs
            }

            System.out.println(); // Blank line for better readability
        }

        sc.close(); // Close scanner to prevent resource leaks
    }
}
