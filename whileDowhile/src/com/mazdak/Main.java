package com.mazdak;

public class Main {

  public static void main(String[] args) {
//    int count = 0;
//    while (count != 5) {
//      System.out.println("count value is" + count);
//      count++;
//    }
//
//    while (true) {
//      if (count == 5) {
//        break;
//      }
//      count++;
//      System.out.println("Count val is " + count);
//    }
//    int sum = 0;
//    int evenNums = 0;
//    int number = 4;
//    int finishNum = 20;
//    while (number <= finishNum) {
//      number++;
//      if(!isEvenNumber(number)){
//        continue;
//      }
//      evenNums++;
//      if(evenNums == 6) break;
//      sum += number;
//      System.out.println("even" + number);
//    }
//    System.out.println(sum);
    sumDigits(185);
    System.out.println(sumDigits(185));
  }

  public static boolean isEvenNumber(int num) {
    if (num % 2 == 0) {
      return true;
    }
    return false;
  }

  public static int sumDigits(int number){
    if(number < 10) {
      return -1;
    }
    int sum = 0;
    while (number> 0) {
      int digit = number % 10;
      sum += digit;
      number /= 10;
    }
    return sum;
//    int sum = 0;
//    int container = 0;
//    do {
//      container = (number % 10) * 10;
//      sum += number - container;
//      number = container;
//    } while (container == number);
//    return  sum;
  }
}
