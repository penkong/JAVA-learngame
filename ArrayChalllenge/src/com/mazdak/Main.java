package com.mazdak;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        int[] myInt = getIntegers(5);
        int[] sorted1 = sortInt(myInt);
        printArr(sorted1);
    }

    public static int[] getIntegers(int capacity){

        int[] arr = new int[capacity];

        System.out.println("enter" + capacity + "integer Value:\r");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void printArr(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.println("elelment " + i+ "contents" + arr[i]);
        }
    }

    public static int[] sortInt(int[] arr){

//        int[] sorted = new int[arr.length];
////        for (int i = 0; i < arr.length; i++) {
////            sorted[i] = arr[i];
////        }

        int[] sorted = Arrays.copyOf(arr, arr.length);

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sorted.length -1; i++) {
                if (sorted[i] < sorted[i+1]) {
                    temp = sorted[i];
                    sorted[i] = sorted[i+1];
                    sorted[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sorted;
    }




}
