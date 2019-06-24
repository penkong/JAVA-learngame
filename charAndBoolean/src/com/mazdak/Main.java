package com.mazdak;

public class Main {
    
    public static void main(String[] args) {
        
        //one char only, width 2bytes
        char myChar = '\u00A9';
        System.out.println("myChar = " + myChar);

        //
        boolean myBool = true;

        char registered = '\u00AE';
        System.out.println("registered = " + registered);
        
    }
}
