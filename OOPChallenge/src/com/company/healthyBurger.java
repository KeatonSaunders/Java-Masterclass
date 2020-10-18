package com.company;

public class healthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public healthyBurger(String meat, double price) {
        super("Healthy burger", meat, "Brown rye", price);
    }

    public void addHealthAdd1 (String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthAdd2 (String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double price = super.itemizeHamburger();
        if (this.healthyExtra1Name != null) {
            price += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an additional " + this.healthyExtra1Price);
        }

        if (this.healthyExtra2Name != null) {
            price += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an additional " + this.healthyExtra2Price);
        }
        return price;
    }
}
