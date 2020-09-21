package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Min float value is " + myMinFloatValue);
        System.out.println("Max float value is " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Min double value is " + myMinDoubleValue);
        System.out.println("Max double value is " + myMaxDoubleValue);

        int myIntValue = 5/3;
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5d/3d;

        System.out.println("My int value is " + myIntValue);
        System.out.println("My float value is " + myFloatValue);
        System.out.println("My double value is " + myDoubleValue);

        double myPoundValue = 80d;
        double myKilogramValue = myPoundValue * 0.45359237;
        System.out.println(myKilogramValue);

    }
}
