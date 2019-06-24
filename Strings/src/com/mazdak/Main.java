package com.mazdak;

public class Main {

    public static void main(String[] args) {
        // combine primitive vars give us super vars
        // 8 primitive types
        // byte, short, int , long , float, double, char , boolean
        // chars ==> String
        String myString = "this is a String";
        System.out.println("myString = " + myString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString = " + lastString);
        double doubleNum = 101.23;
        lastString = lastString + doubleNum;
        System.out.println("lastString = " + lastString);
    }
}
