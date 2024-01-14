package Lab01;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        // Print a prompt to the user.
        System.out.print("Enter the length in centimetres: ");
        // Read the length in centimetres from the user.
        int centimetres = scanner.nextInt();
// Convert the centimetres to inches.
        double inches = centimetres / 2.54;
// Get the number of feet.
        int feet = (int) inches / 12;
// Get the number of inches that are left over after dividing by 12.
        inches %= 12;
// Print the result.
        System.out.println("Length = " + feet + " feet and " + inches + " inches.");

    }
}
