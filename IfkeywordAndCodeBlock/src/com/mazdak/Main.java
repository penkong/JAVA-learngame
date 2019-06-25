package com.mazdak;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int lvlComp = 5;
        int bonus = 100;
        if(score == 5000) {
            System.out.println("your score was 5000");
        } else {
            System.out.println("got here");
        }
        int newScore = 1000;
        int lvl = 8;
        int bounuses = 200;
        if (gameOver){
            System.out.println("final score = " + newScore + (bounuses * lvl));

        }
    }
}
