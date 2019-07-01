package com.mazdak;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        // array hold values of same type;
//        // must specific size of arr
//        int[] myVarArr = new int[10];
////        myVarArr[5] = 50;
////        int[] myVarArr = {1,2,3,4,5,6,7,8,9,10};
//        for (int i = 0; i < myVarArr.length ; i++) {
//            myVarArr[i] = i*10;
//        }
////        for (int i = 0; i < myVarArr.length ; i++) {
////            System.out.println(i + " value is " + myVarArr[i]);
////        }
//        double[] myDobArr = new double[10];
////        System.out.println(myVarArr[5]);
//        printArr(myVarArr);
        int[] getInt = getInegers(5);
        for (int i = 0; i < getInt.length; i++) {
            System.out.println("element " + i + "typed " +  getInt[i]);
        }
        System.out.println(getAvrage(getInt));
    }
//    public static void printArr(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("arr[i] " + arr[i]);
//        }
//    }
    public static int[] getInegers(int num) {
        System.out.println(num + " int values.\r");
        int[] values = new int[num];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static double getAvrage(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / (double) arr.length;
    }
}
