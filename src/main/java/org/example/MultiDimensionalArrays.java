package org.example;

public class MultiDimensionalArrays {
    public static   void main(String arg[]){
        int  marks[][] = {
                {10,23,45,56,78},
                {45,56,25,56,35},
                {45,25,45,65,35}
        };

        for (int i = 0; i<3; i++){
            for (int j = 0; j<5; j++){
                System.out.println(marks[i][j] + "\t");
            }
        }
    }
}
