package com.mazdak;

public class Main {

  public static void main(String[] args) {
    int highScore = calculateScore(true, 30, 3, 20);
    System.out.println("highScore = " + highScore);

    int highScorePosition = calculateHighScorePosition(1600);
    displayHighScorePosition("maz", highScorePosition);

    highScorePosition = calculateHighScorePosition(900);
    displayHighScorePosition("has", highScorePosition);

    highScorePosition = calculateHighScorePosition(400);
    displayHighScorePosition("fas", highScorePosition);

    highScorePosition = calculateHighScorePosition(50);
    displayHighScorePosition("tas", highScorePosition);

  }


  public static int calculateScore(boolean gameOver, int score, int lvl, int bonus) {
    if (gameOver) {
      int finalScore = score + (lvl * bonus);
      System.out.println("finalScore = " + finalScore);
      return finalScore;
    }
    return -1;
  }

  public static int calculateHighScorePosition(int score) {
//    if (score >= 1000) {
//      return 1;
//    } else if (score >= 500) {
//      return 2;
//    } else if (score >= 100) {
//      return 3;
//    }return 4;
    int position = 4;
    if (score >= 1000) {
      position = 1;
    } else if (score >= 500) {
      position = 2;
    } else if (score >= 100) {
      position = 3;
    }
    return position;
  }

  public static void displayHighScorePosition(String name, int highScorePosition) {
    System.out.println(name + " managed to get into position " + highScorePosition
            + " on the high score");

  }
}
