package com.mazdak;

public class Main {

    public static void main(String[] args) {
        //double and float
        // int is 4bytes
        int myIntVal = 5;
        System.out.println("myIntVal = " + myIntVal);

        // float 7 digit ,(float) 5.25
        // int is 4 bytes
        float mtFloatVal = 5f;
        float mtFloatVal2 = 5f / 2f;
        System.out.println("mtFloatVal = " + mtFloatVal);

        // double 16 digit , java take decimal by nature double not float
        // double is 8bytes
        // double is faster , built in use double , more precise
        double myDoubleVal = 5;
        System.out.println("myDoubleVal = " + myDoubleVal);

        //convert kg to pound
        double kgRatioPound = 0.453_592_37d;
        double weightInPounds = 200d;
        double weightInKg = weightInPounds * kgRatioPound;
        System.out.println("weightInKg = " + weightInKg);
    }
}
