package se.lexicon;


import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        String name;

        // Prompt the user to enter their name for the first time
        System.out.print("Enter your name: ");
        name = scanner.nextLine();  // Read the user's name and store it in the variable 'name'

        // Print the greeting message
        System.out.println("Hello " + name);

        // Variable to control the loop
        String continueInput;

        // Ask the user if they want to continue or quit
        System.out.print("Do you want to continue? Enter 'q' to quit or any other key to continue: ");
        continueInput = scanner.nextLine();

        // Loop to continuously ask for the user's name until 'q' is entered
        while (!continueInput.equalsIgnoreCase("q")) {
            // Prompt the user to enter their name
            System.out.print("Enter your name: ");
            name = scanner.nextLine();  // Read the user's name and store it in the variable 'name'

            // Print the greeting message
            System.out.println("Hello " + name);

            // Ask the user if they want to continue or quit
            System.out.print("Do you want to continue? Enter 'q' to quit or any other key to continue: ");
            continueInput = scanner.nextLine();
        }

        // Close the Scanner object to free up resources
        scanner.close();
        System.out.println("Program terminated.");
    }
}
