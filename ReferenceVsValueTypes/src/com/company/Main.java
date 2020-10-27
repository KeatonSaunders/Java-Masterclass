package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 10;
        int mySecondIntValue = myIntValue;
        System.out.println("My int value = " + myIntValue);
        System.out.println("Another int value = " + mySecondIntValue);

        mySecondIntValue++;

        System.out.println("My int value = " + myIntValue);
        System.out.println("Another int value = " + mySecondIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 5;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray = new int[] {4,5,6,7,8};
        modifyArray(myIntArray);

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
    }

    public static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1,2,3,4,5}; //new keyword dereferences the reference so it doesn't override
    }
}
