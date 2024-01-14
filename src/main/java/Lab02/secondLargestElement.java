package Lab02;

import java.util.Scanner;

public class secondLargestElement {
    public static void main(String[] args) {
// Create an array to store the numbers
        int[] numbers = new int[5];
// Create a scanner to accept user input
        Scanner scanner = new Scanner(System.in);
// Prompt the user to enter five numbers
        System.out.println("Enter five numbers, one at a time:");
// Read and store the numbers in the array
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
// Close the scanner
        scanner.close();
// Find the second-largest element
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number < largest) {
                secondLargest = number;
            }
        }
// Check if there's a second-largest element
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second-largest element. All elements are the same.");
        } else {
            System.out.println("The second-largest element is " + secondLargest + ".");
        }
    }

}
