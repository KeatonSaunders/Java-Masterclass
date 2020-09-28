package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;

        while (counter <= 5) {

            System.out.println("Enter number " + counter + ": ");

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;

            } else {
                System.out.println("Invalid number.");
            }

            scanner.nextLine(); //handle enter key
        }

        System.out.println("Sum of numbers entered: " + sum);

        scanner.close();
    }
}
