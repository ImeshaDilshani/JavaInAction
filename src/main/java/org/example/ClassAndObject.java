package org.example;

import java.util.Scanner;

class Student {
    int studentID;
    String studentName;
    int studentAge;
    Scanner scanner = new Scanner(System.in);

    public void AcceptDetails() {
        System.out.println("Enter Student ID: ");
        studentID = scanner.nextInt();
        System.out.println("Enter Student Name: ");
        studentName = scanner.next();
        System.out.println("Enter Student Age: ");
        studentAge = scanner.nextInt();
    }

    public void DisplayDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
    }
}

class Marks extends Student {
    protected float objectiveMarks;
    protected float subjectiveMarks;

    Scanner scanner = new Scanner(System.in);

    public void AcceptDetails() {
        super.AcceptDetails();
        System.out.println("Enter Objective Marks: ");
        objectiveMarks = scanner.nextFloat();
        System.out.println("Enter Subjective Marks: ");
        subjectiveMarks = scanner.nextFloat();
    }

    public void DisplayDetails() {
        super.DisplayDetails();
        System.out.println("Objective Marks is: " + objectiveMarks);
        System.out.println("Subjective Marks is: " + subjectiveMarks);
    }
}

class Sport extends Marks {
    protected float score;

    public void AcceptDetails() {
        super.AcceptDetails();
        System.out.println("Enter Sport Score: ");
        score = scanner.nextFloat();
    }

    public void DisplayDetails() {
        super.DisplayDetails();
        System.out.println("Sport Score: " + score);
    }
}

class Result extends Sport {
    private float TotalMarks, AverageMarks;

    void Calculate() {
        TotalMarks = objectiveMarks + subjectiveMarks + score;
        AverageMarks = TotalMarks / 3;
        System.out.println("Total Marks: " + TotalMarks);
        System.out.println("Average Marks: " + AverageMarks);
    }
}

public class ClassAndObject {
    public static void main(String arg[]) {
        Result result = new Result();
        result.AcceptDetails();
        result.DisplayDetails();
        result.Calculate();
    }
}
