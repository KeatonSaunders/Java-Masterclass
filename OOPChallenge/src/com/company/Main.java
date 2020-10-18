package com.company;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic","Beef","White",35.60);
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAdd1("Tomato",0.75);
        hamburger.addHamburgerAdd2("Lettuce",0.5);
        hamburger.addHamburgerAdd3("Cheese",0.95);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

        healthyBurger healthy = new healthyBurger("Bacon",5.75);
        healthy.addHealthAdd1("Lentils",0.75);
        System.out.println("Total healthy burger price is " + healthy.itemizeHamburger());

        deluxeBurger deluxe = new deluxeBurger();
        deluxe.itemizeHamburger();
        deluxe.addHamburgerAdd1("Lettuce",3);



    }
}
