package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer minimum value is " + myMinIntValue);
        System.out.println("Integer maximum value is " + myMaxIntValue);
        System.out.println("Busted maximum value is " + (myMaxIntValue + 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value is " + myMinByteValue);
        System.out.println("Byte maximum value is " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum value is " + myMinShortValue);
        System.out.println("Short maximum value is " + myMaxShortValue);

        long MyLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long minimum value is " + myMinLongValue);
        System.out.println("Long maximum value is " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_123L;
        System.out.println("Big Long value is " + bigLongLiteralValue);

        int myTotal = (myMinIntValue/2);
        byte myNewByteValue = (byte) (myMinByteValue/2);
        short myNewShortValue = (short) (myMinShortValue/2);

        byte KeatonByte = 10;
        short KeatonShort = 20;
        int KeatonInt = 50;
        long KeatonTotal = 50000L + 10L*(KeatonByte+KeatonShort+KeatonInt);
        System.out.println("Keaton's total is " + KeatonTotal);
    }
}
