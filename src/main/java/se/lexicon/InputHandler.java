package se.lexicon;

import java.util.Scanner;

public class InputHandler {
    private Scanner scanner;

    public InputHandler() {
        this.scanner = new Scanner(System.in);
    }

    public int getValidNumber() {
        int number = -1;
        boolean validInput = false;

        while (!validInput) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number >= 0) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a non-negative number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }

        return number;
    }

    public String getContinueInput() {
        return scanner.next();
    }

    public void close() {
        scanner.close();
    }
}
