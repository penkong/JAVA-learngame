package com.mazdak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //reading user input with class like scanner, next
        // NextLine ret string,  Scanner text scanner

        // system in allow us type in console and bring back it to program
        // scanner read user input
        Scanner scanner = new Scanner(System.in);



        System.out.println("enter year of your birth: ");
        // this check if next input is integer
        // help us filter char input in num fields
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {

            // what user type auto convert to integer its functionality of scanner
            int yearOfBirth = scanner.nextInt();


            // handle next line for char after int
            scanner.nextLine();


            System.out.println("enter name :");
            // next line to read the line of input from console
            String name = scanner.nextLine();


            int age = 2019 - yearOfBirth;


            if (age >= 0 && age <= 100) {
                System.out.println("your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("invalid year of birth");
            }

        } else {

            System.out.println("Unable to parse year of birth");
        }


        scanner.close();
        //

    }
}
