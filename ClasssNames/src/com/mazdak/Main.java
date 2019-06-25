package com.mazdak;

public class Main {

  public static void main(String[] args) {
    //method over loading can call method with different input cause diff method
    calculateScore("maz", 30);
    calculateScore(40);
    calculateScore();
    calcFeetAndInchesToCM(6,2);
    calcFeetAndInchesToCM(75);
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

    if(feet < 0 || inches < 0 || inches > 12) {
      System.out.println("invalid inputs");
      return  -1;
    }

    double centiM = (feet * 12) * 2.54;
    centiM += inches * 2.54;
    System.out.println(feet + " feet , " + inches + " inches = " + centiM);
    return centiM;
  }
  public static double calcFeetAndInchesToCM(double inches) {

    if(inches < 0) {
      System.out.println("invalid inputs");
      return  -1;
    }
    // make sure inches convert to whole number
    double feet = (int) inches / 12;
    double remainInches = (int) inches % 12;
    System.out.println(inches + " inches is equal to " +
            feet +  " feet and " + remainInches + " inches");
    return calcFeetAndInchesToCM(feet, remainInches);
  }
}
