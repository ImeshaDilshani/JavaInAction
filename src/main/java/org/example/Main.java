package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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