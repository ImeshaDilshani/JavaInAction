package Lab01;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName = scanner.nextLine();

        int firstSpaceIndex = fullName.indexOf("");
        int lastSpaceIndex = fullName.lastIndexOf("");

        String firstName = fullName.substring(0,firstSpaceIndex);
        String middleName = fullName.substring(firstSpaceIndex+1,lastSpaceIndex);
        String lastName = fullName.substring(lastSpaceIndex+1);

        String middleInitial = middleName.charAt(0) + "." ;

        String formatName = lastName + "," + firstName + "" + middleInitial;

        System.out.println("Format name: " + formatName);
    }
}
