package se.lexicon;

public class TimeConverter {

    public static void convertTime(int totalSeconds) {
        // Convert the total seconds to hours, minutes, and remaining seconds
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        // Print the result in the specified format
        System.out.printf("Hour: %02d, Minutes: %02d, Seconds: %02d%n", hours, minutes, seconds);
    }
}
