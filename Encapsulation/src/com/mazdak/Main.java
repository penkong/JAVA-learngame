package com.mazdak;

public class Main {

    public static void main(String[] args) {
	      // encapsulation a mechanism allow us to restrict access to certain
        // components in the obj that you create it
        // for protect;

//        Player player = new Player();
//
//        player.name = "maz";
//        // another bug we maybe forget to init sth like health;
//        player.health = 30;
//        player.weapon = "Sword";
//
//        int damage = 10;
//
//        player.loseHealth(damage);
//        System.out.println("remain health " + player.healthRemain());
//
//        damage = 23;
//        // this is bug
//        player.health = 200;
//        // nobody must not control that without specific predefined function
//        player.loseHealth(damage);
//        System.out.println("remain health " + player.healthRemain());
        EnhancedPlayer player = new EnhancedPlayer("max",100,"wso");
        System.out.println("inital health is " + player.getHealthed());


        Printer printer = new Printer(59, true);
        System.out.println("inital page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new print totoal" + printer.getPagesPrinted());
    }
}
