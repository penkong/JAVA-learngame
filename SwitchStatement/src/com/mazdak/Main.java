package com.mazdak;

public class Main {

  public static void main(String[] args) {
    //switch
    int switchVal = 3;
    switch (switchVal) {
      case 1:
        System.out.println("value was one");
        break;

      case 2:
        System.out.println("value was 2");
        break;

      case 3: case 4: case 5:
        System.out.println("was a 3, or a 4, or a 5");
        System.out.println("actually it was a " + switchVal);
        break;

      default:
        System.out.println("was not 1 or 2");
        break;
    }
    char swichChar = 'c';
    switch (swichChar) {
      case 'a':
        System.out.println("this is a  'a'");
        break;
      case 'b':
        System.out.println("this is a 'b'");
        break;
      case 'c':
        System.out.println("this is a 'c'");
        break;
      default:
        System.out.println("this is a not found");
        break;
    }
    String month = "January";
    switch (month.toLowerCase()) {
      case "january":
        System.out.println("this is new year");
        break;
    }
  }
}
