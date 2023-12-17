package org.example;

public class StringBufferVSStringBuilder {
    public static void main(String[] arg){
        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append("World");
        System.out.println(buffer);
    }
}
