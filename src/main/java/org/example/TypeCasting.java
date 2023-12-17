package org.example;

public class TypeCasting {
    public static void main(String[] arg){
        int intvalue = 100;
        //implicit type casting from int to long
        long longvalue = intvalue;
        //implicit type casting from long to double
        double douublevalue = longvalue;
        System.out.println(intvalue);
        System.out.println(longvalue);
        System.out.println(douublevalue);

        double doublevalue2 = 100.25;
        //Explicit type casting from double to int
        int intvalue2 = (int)doublevalue2;
    }
}
