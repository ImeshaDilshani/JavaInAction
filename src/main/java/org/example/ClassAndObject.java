package org.example;

import java.util.Scanner;

class Student{
    int studentID;
    String studentName;
    int studentAge;
    Scanner scanner = new Scanner(System.in);

    public void AcceptDetails(){
        System.out.println("Enter Student ID : ");
        studentID = scanner.nextInt();
        System.out.println("Enter Student Name : ");
        studentName = scanner.next();
        System.out.println("Enter Student Age : ");
        studentAge = scanner.nextInt();
    }

    public void DisplayDetails(){
        System.out.println("Student ID : " + studentID);
        System.out.println("Student Name : " + studentName);
        System.out.println("Student Age : " + studentAge);
    }

}
public class ClassAndObject {
    public static void main(String arg[]){
        Student student = new Student();
        student.AcceptDetails();
        student.DisplayDetails();

    }
}
