package com.mazdak;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please Enter Numbers: ");

    // also can set min to biggest number of int and vice versa for max
    // min = 2147... max = -2147... Integer class .MAX_ or MIN_VALUE
    int min = 0;
    int max = 0;
    // a boolean is flag
    boolean first = true;

    while (true) {

      System.out.println("enter number : ");
      boolean hasInt = scanner.hasNextInt();
      if (hasInt) {

        int num = scanner.nextInt();

        if (first) {
          first = false;
          min = num;
          max = num;
        }

        if (num > max) {
          max = num;
        }
        if (num < min) {
          min = num;
        }

      } else {

        break;
      }
      scanner.nextLine();
    }
    System.out.println("min = " + min + " , max = " + max);
    scanner.close();
  }
}
