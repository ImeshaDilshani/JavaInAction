package org.example;

public class SingleDimensionalArrays {
    public static void main(String arg[]){
//        //declaring an array
//        int[] marks;
//        marks = new int[5];
//        //or
//        int[] marks = new int[5];

        //Initializing an array
//        int[] marks = new int[] {10,20,30,40,50};

        //Declare and Assign
        int[] marks = new int[5];
        marks[0] = 100;
        marks[1] = 200;
        marks[2] = 300;
        marks[3] = 400;
        marks[4] = 500;

        for (int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}
