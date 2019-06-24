package com.mazdak;

public class Main {

    public static void main(String[] args) {
	    // int has width of 32;
      int myValue = 2_253_355;

      // more efficient to use get less memory %25 of integer
      byte myByteVal = -128;
      // java normally change expression to int must explicitly define it
      byte myHalf = (byte) (myByteVal/2);


      // twice amount of byte , half of integer
      short myShortValue = 32767;
      short myHalfShort = (short) (myShortValue/2);
      
      // long has width of 64; 2^63
      long myLongVal = 100L;
      long totalLong = 6000L + 2022L*(myShortValue + myHalfShort);
      System.out.println("totalLong = " + totalLong);
    }
}
