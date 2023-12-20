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

class Marks extends Student{
    private float objectiveMarks;
    private float subjectiveMarks;

    Scanner scanner = new Scanner(System.in);

    public void AcceptDetails(){
        super.AcceptDetails();
        System.out.println("Enter Objective Marks : ");
        objectiveMarks = scanner.nextFloat();
        System.out.println("Enter Subjective Marks : ");
        subjectiveMarks = scanner.nextFloat();

    }

    public void DisplayDetails(){
        super.DisplayDetails();
        System.out.println("Objective Marks is : " + objectiveMarks);
        System.out.println("Subjective Marks is : " + subjectiveMarks);

    }

}
class Sport extends Marks{
    private float score;
    public void AcceptDetails(){
        super.AcceptDetails();
        System.out.println("Enter Sport Score : ");
        score = scanner.nextFloat();


    }

    public void DisplayDetails(){
        super.DisplayDetails();
        System.out.println("Sport Score : " + score);


    }
}
public class ClassAndObject {
    public static void main(String arg[]){
        Sport obj = new Sport();
        obj.AcceptDetails();
        obj.DisplayDetails();

    }
}
