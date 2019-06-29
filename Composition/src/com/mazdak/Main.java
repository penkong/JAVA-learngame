package com.mazdak;

public class Main {
        // First composition then inheritance;
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,15);

        Case theCase = new Case("234","lenovo","220",dimensions);
        Monitor theMonitor = new Monitor("27Beast","acer",27,new Resolution(2540,1440));
        Motherboard theMotherboard = new Motherboard("BJ-300","asus",4,6,"v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

//        thePC.getMonitor().drawPixelAt(1500,1200,"red");
//        thePC.getMotherboard().loadProgram("windows 3.0");
//        thePC.getTheCase().pressPowerButton();

        thePC.powerUp();

        Wall wall1 = new Wall("west");
        Wall wall2 = new Wall("east");
        Wall wall3 = new Wall("north");
        Wall wall4 = new Wall("south");
        Ceiling ceiling = new Ceiling(12,55);
        Bed bed = new Bed("modern",4,5,2,1);
        Lamp lamp = new Lamp("classic",false,70);

        Bedroom bedroom = new Bedroom("maz",wall1,wall2,wall3,wall4,ceiling,bed,lamp);

        bedroom.getLamp().turnOn();
        bedroom.makeBed();
    }
}
