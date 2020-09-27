package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 1;

        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("********************************");

        count = 1;

        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count != 6);

        System.out.println("********************************");

        int number = 4;
        int endNumber = 20;
        int evenNumbersFound = 0;

        while (number <= endNumber) {
            number++;

            if(!isEven(number)) {
                continue;
            }

            System.out.println("Even number " + number);

            evenNumbersFound++;
            if (evenNumbersFound >= 5){
                break;
            }
        }

        System.out.println("Total even numbers found: " + evenNumbersFound);
    }

    public static boolean isEven(int number) {
        if (number % 2 ==0) {
            return true;
        } else {
            return false;
        }
    }
}
