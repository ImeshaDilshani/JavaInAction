package org.example;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] arg){
       Scanner scanner = new Scanner(System.in);
        String input = "";
       do {
           System.out.println("Enter message : ");
           input = scanner.next().toLowerCase();
           System.out.println(input);
       }while (!input.equals("quit"));


    }
}
