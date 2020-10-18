package com.company;

public class Main {

    public static void main(String[] args) {

        Player thisPlayer = new Player();

        thisPlayer.name = "Keaton";
        thisPlayer.health = 20;
        thisPlayer.weapon = "Gun";

        int damage = 10;
        thisPlayer.loseHealth(damage);
        System.out.println("Remaining health = " + thisPlayer.health);

        damage = 11;
        thisPlayer.health = 200; //shouldn't have this control
        thisPlayer.loseHealth(damage);
        System.out.println("Remaining health = " + thisPlayer.health);

        enhancedPlayer player = new enhancedPlayer("Hannah",50,"Sword");
        System.out.println("Initial health is " + player.getHitPoints());

        Printer printer = new Printer(50,true);

        System.out.println("Initial page count is " + printer.getNumPages());

        int pagesPrinted = printer.printPages(4);

        System.out.println("Pages printed was " + pagesPrinted + " Total pages printed is " + printer.getNumPages());

        pagesPrinted = printer.printPages(2);

        System.out.println("Pages printed was " + pagesPrinted + " Total pages printed is " + printer.getNumPages());


    }
}
