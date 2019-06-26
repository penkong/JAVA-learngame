package com.mazdak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter 10 specific Integers : ");

        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {

            int nums = 0;
            int sum = 0;
            for (int i = 0; i < 9; i++) {

                nums = scanner.nextInt();
                scanner.nextLine();
                sum += nums;
            }

            System.out.println("sum of your inputs are: " + sum);

        } else {

            System.out.println("Unable to parse year of birth");
        }

        scanner.close();
    }
}
