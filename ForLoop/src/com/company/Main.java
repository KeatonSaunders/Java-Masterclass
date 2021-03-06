package com.company;

public class Main {

    public static void main(String[] args) {

        for(int i=2; i<9; i++) {

            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000,i)));
        }

        System.out.println("*****************************************");

        for(int i=8; i>1; i--) {

            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000,i)));
        }

        int count = 0;

        for(int i=1; i<100; i++) {

            if (isPrime(i)){
                System.out.println(i + " is a prime number.");
                count++;
            }

            if (count == 3) {
                System.out.println("Exiting for loop.");
                break;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n==1) {
            return false;
        }

        for (int i=2; i<=n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double Amount, double InterestRate){

        return (Amount * InterestRate) / 100;

    }
}
