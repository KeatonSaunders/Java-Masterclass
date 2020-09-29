package com.company;

public class Main {

    public static void main(String[] args) {

        Customer keaton = new Customer();

        System.out.println("Default values are " + keaton.getName() + " " + keaton.getCreditLimit() + " " + keaton.getEmail());

        Customer kenny = new Customer("Kendra",1000);

        System.out.println("Kenny G name: " + kenny.getName() + " Limit: " + kenny.getCreditLimit());

        Customer hannah = new Customer("Hannah",10000,"hmulli@gmail.com");

        System.out.println("Hannah name: " + hannah.getName() + " Limit: " + hannah.getCreditLimit() + " Email: " + hannah.getEmail());

    }
}
