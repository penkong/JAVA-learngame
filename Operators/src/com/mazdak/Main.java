package com.mazdak;

import java.util.logging.SocketHandler;

public class Main {

  public static void main(String[] args) {
    //
    int result = 3 + 1;
    int previousResult = result;
    result = result - 1;
    System.out.println("previousResult = " + previousResult);
    previousResult = result;
    result = result * 10;
    System.out.println("previousResult = " + previousResult);
    previousResult = result;
    result = result / 5;
    System.out.println("result = " + result);
    previousResult = result;
    result = result % 3;
    System.out.println("result = " + result);
    result++;
    System.out.println("result = " + result);
    result += 2;
    result *= 10;
    result -= 10;
    result /= 10;
    System.out.println("result = " + result);
    boolean isAlien = false;
    if (isAlien == false)
      System.out.println("it is not a alien");
    int isScore = 30;
    int topScore = 100;
    if (topScore > 100)
      System.out.println("you got a high Score");
    if (topScore < isScore && topScore > 100)
      System.out.println("yes maybe");
    // consider operator precedence also;
    boolean alien = isAlien ? true : false;
    //
    double vard = 20;
    double vard2 = 80;
    double vard3 = (vard + vard2) * 25;
    double remaind = vard3 % 40;
    if (remaind <= 20)
      System.out.println("total was over limit");
  }
}
