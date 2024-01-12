package org.example;

import java.io.InputStream;

public class Scanner {
    public Scanner(InputStream in) {
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = scanner.next();
        System.out.println("Enter Your Age: ");
        int age = scanner.nextInt();
        System.out.println("Enter Your Gender(M/F): ");
        char gender = scanner.next().charAt(0);
        System.out.println("Enter Your Phone Number: ");


        System.out.println("Your name is "+ name);
        System.out.println("Your age is " + age);
        System.out.println("Your gender is " + gender);

    }
}