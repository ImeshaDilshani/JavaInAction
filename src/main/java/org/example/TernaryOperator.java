package org.example;

public class TernaryOperator {
    public static   void main(String arg[]){
        boolean isAuthenticate = true;
        if(isAuthenticate){
            System.out.println("You are log in successfully");
        }else
            System.out.println("You are no log in successfully");

        String result = (isAuthenticate) ? "LoggedIn" : "Not LoggedIn";
        System.out.println(result);
    }
}
