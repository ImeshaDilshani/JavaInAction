package Lab01;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] arg){
        // Create a Scanner object to read input from the user.
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter their full name.
        System.out.print("Enter your full name (first middle last): ");
        // Read the user's full name into a string.
        String fullName = scanner.nextLine();
        // Find the first and last spaces in the full name.
        int firstSpaceIndex = fullName.indexOf(' ');
        int lastSpaceIndex = fullName.lastIndexOf(' ');
        // Extract the first, middle, and last name from the full name.
        String firstName = fullName.substring(0, firstSpaceIndex);
        String middleName = fullName.substring(firstSpaceIndex + 1, lastSpaceIndex);
        String lastName = fullName.substring(lastSpaceIndex + 1);
        // Extract the middle initial from the middle name.
        String middleInitial = middleName.charAt(0) + ".";
        // Format the name into last, first, middle initial format.
        String formattedName = lastName + ", " + firstName + " " + middleInitial;
        // Print the formatted name.
        System.out.println("Formatted name: " + formattedName);

    }
}
