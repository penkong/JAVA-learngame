package com.mazdak;

import javax.imageio.metadata.IIOMetadataNode;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        System.out.println("enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] returnArr = readInt(count);
        int retMin = findMin(returnArr);
        System.out.println("ret min " + retMin);

    }

    private static int[] readInt(int count){
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter a num: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            arr[i]= number;
        }
        return arr;
    }

    private static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (val < min) {
                min = val;
            }
        }
        return min;
    }















}
