package com.company;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Absa");
        bank.addBranch("Atholl");
        bank.addCustomer("Atholl","Keaton",100);
        bank.addCustomer("Atholl","Kendra",120);
        bank.addCustomer("Atholl","Hannah",150);

        bank.addBranch("Pinelands");
        bank.addCustomer("Pinelands","Diana",200);

        bank.addCustomerTransaction("Atholl","Keaton",42.50);
        bank.addCustomerTransaction("Atholl","Kendra",22.40);
        bank.addCustomerTransaction("Atholl","Hannah",12.50);

        bank.listCustomers("Atholl",true);
        bank.listCustomers("Pinelands",true);

    }
}
