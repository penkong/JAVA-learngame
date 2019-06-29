package com.mazdak;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,15);

        Case theCase = new Case("234","lenovo","220",dimensions);
        Monitor theMonitor = new Monitor("27Beast","acer",27,new Resolution(2540,1440));
        Motherboard theMotherboard = new Motherboard("BJ-300","asus",4,6,"v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        thePC.getMonitor().drawPixelAt(1500,1200,"red");
        thePC.getMotherboard().loadProgram("windows 3.0");
        thePC.getTheCase().pressPowerButton();
    }
}
