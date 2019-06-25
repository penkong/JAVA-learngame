package com.mazdak;

public class Main {

  // how constant in java
  private static final String INVALID_MESSAGE = "invalid values";

  public static void main(String[] args) {
    //method over loading can call method with different input cause diff method
    calculateScore("maz", 30);
    calculateScore(40);
    calculateScore();
    calcFeetAndInchesToCM(6, 2);
    calcFeetAndInchesToCM(75);
//    getDurationString(376,45);
//    getDurationString(455000);
    System.out.println(getDurationString(65, 34));
    System.out.println(getDurationString(6799));

  }

  public static int calculateScore(String name, int score) {
    System.out.println("player " + name + "scored " + score + " points");
    return score * 1000;
  }

  public static int calculateScore(int score) {
    System.out.println("unknown player " + "scored " + score + " points");
    return score * 1000;
  }

  public static int calculateScore() {
    System.out.println("player  scored  0 points");
    return 0;
  }

  public static double calcFeetAndInchesToCM(double feet, double inches) {

    if (feet < 0 || inches < 0 || inches > 12) {
      System.out.println("invalid inputs");
      return -1;
    }

    double centiM = (feet * 12) * 2.54;
    centiM += inches * 2.54;
    System.out.println(feet + " feet , " + inches + " inches = " + centiM);
    return centiM;
  }

  public static double calcFeetAndInchesToCM(double inches) {

    if (inches < 0) {
      System.out.println(INVALID_MESSAGE);
      return -1;
    }
    // make sure inches convert to whole number
    double feet = (int) inches / 12;
    double remainInches = (int) inches % 12;
    System.out.println(inches + " inches is equal to " +
            feet + " feet and " + remainInches + " inches");
    return calcFeetAndInchesToCM(feet, remainInches);
  }

//  public static void getDurationString(int minutes, int seconds) {
//    if (minutes < 0 || seconds < 0 || seconds > 59){
//      System.out.println("invalid values");
//    }
//    int hours = (int) Math.floor(minutes / 60);
//    int remainMin = minutes % 60;
//    System.out.println(hours + "h " + remainMin + "m " + seconds + "s");
//  }
//  public static void getDurationString( int seconds) {
//    if (seconds < 0){
//      System.out.println("invalid values");
//    }
//    int remainSec = seconds % 60;
//    int minutes = (int) Math.floor(seconds / 60);
//    getDurationString(minutes, remainSec);
////    int remainMin = minutes % 60;
////    int hours = (int) Math.floor(minutes / 60);
////    System.out.println(hours + "h " + remainMin + "m " + remainSec + "s");
//  }

  private static String getDurationString(long minutes, long seconds) {
    if (minutes < 0 || seconds < 0 || seconds > 59) {
      return INVALID_MESSAGE;
    }
    long hours = minutes / 60;
    long remainMin = minutes % 60;
    return hours + "h " + remainMin + "m " + seconds + "s ";
  }

  private static String getDurationString(long seconds) {
    if (seconds < 0) {
      return INVALID_MESSAGE;
    }
    long minutes = seconds / 60;
    long remainSec = seconds % 60;
    return getDurationString(minutes, remainSec);
  }
}
