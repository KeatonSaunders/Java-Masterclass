package com.company;

public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    public Customer() {
        this("Unknown customer",1000,"Unknown email");
        System.out.println("No parameter constructor called.");
    }

    public Customer(String name, double creditLimit) {
        this(name,creditLimit,"Unknown email");
    }

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
