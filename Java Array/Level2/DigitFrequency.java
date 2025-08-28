// File: DigitFrequency.java
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Frequency array for digits 0-9
        int[] frequency = new int[10];

        // Handle negative input
        number = Math.abs(number);

        // Extract digits and update frequency
        if (number == 0) {
            frequency[0] = 1;
        } else {
            while (number > 0) {
                int digit = (int)(number % 10);
                frequency[digit]++;
                number /= 10;
            }
        }

        // Output
        System.out.println("\n--- Digit Frequency ---");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }

        scanner.close();
    }
}
