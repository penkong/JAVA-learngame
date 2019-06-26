package com.mazdak;

public class Main {

    public static void main(String[] args) {
        String numAsString = "2019";
        System.out.println("number " + numAsString);

        // Integer is wrapper class
        int number = Integer.parseInt(numAsString);
        double numbera = Double.parseDouble(numAsString);

        System.out.println("number = " + number);

        numAsString += 1;
        number += 1;

        System.out.println(numAsString);
        System.out.println(number);


    }
}
