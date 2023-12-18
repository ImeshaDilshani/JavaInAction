package org.example;

public class SwitchCase {
    public static void main(String arg[]){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Admin - Get full access");
        System.out.println("Sub Admin - Get to create delete courses");
        System.out.println("TestPrep - Get to create delete test");
        System.out.println("User - Get access to consume content");
        System.out.println("Enter your choice:");

        String user = scanner.next();

        switch(user){
            case "admin":
                System.out.println("Get full access");
                break;

            case "sub admin":
                System.out.println("Get to create delete courses");
                break;

            case "testprep":
                System.out.println("Get to create delete test");
                break;

            case "user":
                System.out.println("Get access to consume content");
                break;

            default:
                System.out.println("You are a trial user");
        }

    }

}
