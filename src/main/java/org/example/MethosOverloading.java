package org.example;

class Calculation{
    public static int addition(int num1 , int num2){
        return num1 + num2;
    }
    public static int addition(int num1 , int num2,int num3){
        return num1 + num2 + num3;
    }
    public static float addition(float num1 , float num2){
        return num1 + num2;
    }
    public static float addition(float num1 , int num2){
        return num1 + num2;
    }
}
public class MethosOverloading {
    public static void main(String[] arg){
        System.out.println(Calculation.addition(100,200));
        System.out.println(Calculation.addition(100.15F,20.14F));
        System.out.println(Calculation.addition(13.25F,45));
        System.out.println(Calculation.addition(12,56,58));

    }
}
