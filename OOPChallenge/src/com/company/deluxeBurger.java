package com.company;

public class deluxeBurger extends Hamburger {

    public deluxeBurger() {
        super("Deluxe", "Sausage & bacon", "White", 14.50);
        super.addHamburgerAdd1("Chips",2.75);
        super.addHamburgerAdd2("Drink",1.75);
    }

    @Override
    public void addHamburgerAdd1(String name, double price) {
        System.out.println("Can't add to a deluxe burger");
    }

    @Override
    public void addHamburgerAdd2(String name, double price) {
        System.out.println("Can't add to a deluxe burger");
    }

    @Override
    public void addHamburgerAdd3(String name, double price) {
        System.out.println("Can't add to a deluxe burger");
    }

    @Override
    public void addHamburgerAdd4(String name, double price) {
        System.out.println("Can't add to a deluxe burger");
    }
}
