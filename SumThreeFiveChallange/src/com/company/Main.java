package com.company;

public class Main {

    public static void main(String[] args) {

        int total = 0;
        int count = 0;

        for (int i=1; i<=1000; i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                total += i;
                count++;
            }

            if(count == 5) {
                System.out.println("Exiting loop.");
                break;
            }
        }

        System.out.println(total);

    }
}
