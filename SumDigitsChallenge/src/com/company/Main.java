package com.company;

public class Main {

    public static void main(String[] args) {

        int result = sumDigits(125);
        System.out.println("Sum of digits in number 125 is " + result);

    }

    public static int sumDigits(int number) {

        if (number < 10) {
            return -1;
        }

        int sum = 0;

        while(number > 0) {
            // extract least significant digit
            int digit = number % 10;
            sum += digit;
            //drop least significant digit
            number /= 10;
        }

        return sum;
    }
}
