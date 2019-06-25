package com.mazdak;

public class Main {

    public static void main(String[] args) {
//      for guys
      System.out.println(calculateInterest(10999, 2.9));
//      for (init;termination;increment)
      for (int i = 2; i < 5; i++) {
        System.out.println("loop" + i);
      }

      for (int i = 2; i < 9; i++) {
        System.out.println(String.format("%.2f",calculateInterest(10999, i)));
      }

      for (int i = 8; i >= 2 ; i--) {
        System.out.println(String.format("%.2f",calculateInterest(10999, i)));

      }
      int count = 0;
      for (int i = 10; i <50 ; i++) {
        if(isPrime(i)) {
          count++;
          System.out.println("number " + i + " is a prime");
          if (count == 4) {
            System.out.println("exiting");
            break;
          }
        }
      }

      System.out.println(sum(1000));

    }


    public static double calculateInterest(double amount, double interestRate) {

      return (amount * (interestRate / 100));

    }


    public static boolean isPrime(int n) {
      if ( n == 1) {
        return false;
      }
//      n/2 or
      for (int i = 2; i <= (long) Math.sqrt(n); i++) {
        if(n % i == 0 ) {
          return false;
        }
      }
      return true;
    }

    public static int sum(int n) {
      int nums = 0;
      int count = 0;
      for (int i = 1; i <= n; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
          nums += i;
          count++;
          if (count == 5) {
            System.out.println("exiting" + nums);
            break;
          }
        }
      }
      return nums;
    }
}
