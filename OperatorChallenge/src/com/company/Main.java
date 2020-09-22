package com.company;

public class Main {

    public static void main(String[] args) {

        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double result = (firstDouble+secondDouble)*100;
        double remainderResult = result % 40.00;

        boolean remainder = remainderResult == 0 ? true : false;

        System.out.println(remainder);

    }
}
