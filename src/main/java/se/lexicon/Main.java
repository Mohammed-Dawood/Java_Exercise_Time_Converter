package se.lexicon;

public class Main {

    public static void main(String[] args) {
        // Create an InputHandler object to manage user inputs
        InputHandler inputHandler = new InputHandler();
        String continueInput;

        do {
            // Prompt the user to enter the number of seconds
            System.out.print("Input seconds: ");
            int totalSeconds = inputHandler.getValidNumber();

            // Convert and display the time
            TimeConverter.convertTime(totalSeconds);

            // Ask the user if they want to continue or quit
            System.out.print("Do you want to convert another time? Enter 'q' to quit or any other key to continue: ");
            continueInput = inputHandler.getContinueInput();
        } while (!continueInput.equalsIgnoreCase("q"));

        // Close the InputHandler to free up resources
        inputHandler.close();
        System.out.println("Program terminated.");
    }
}
