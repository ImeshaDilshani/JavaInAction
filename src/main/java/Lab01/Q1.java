package Lab01;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input word:");
        String word = scanner.nextLine();

        int length = word.length();
        char middlecharacter = word.charAt(length/2);
        System.out.println("The middle character is :" + middlecharacter);
    }
}
