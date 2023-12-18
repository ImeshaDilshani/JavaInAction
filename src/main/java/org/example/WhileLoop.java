package org.example;
import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")){
            System.out.println("Enter message : ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
    }
}
