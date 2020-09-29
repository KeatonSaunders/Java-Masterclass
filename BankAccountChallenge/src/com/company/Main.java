package com.company;

public class Main {

    public static void main(String[] args) {

        //Account keatonAccount = new Account(950228,500,"Keaton Saunders","keatonsaunders95@gmail.com","0795290163");

        Account keatonAccount = new Account();

        keatonAccount.deposit(200);

        keatonAccount.withdraw(100);

        keatonAccount.withdraw(1000);

        System.out.println("Your balance is " + keatonAccount.getBalance());

        System.out.println("Your account number is " + keatonAccount.getAccountNumber());

        Account kenniesAccount = new Account("Kendra","kendra@gmail.com","0834482397");

        System.out.println(kenniesAccount.getAccountNumber() + " name " + kenniesAccount.getCustomerName());

    }
}
