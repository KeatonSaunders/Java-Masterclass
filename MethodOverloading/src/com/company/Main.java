package com.company;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(600);
        double cents = calcFeetAndInchesToCentimeters(0,1);
        System.out.println(cents);
        calcFeetAndInchesToCentimeters(100);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if(feet < 0 || inches < 0 || inches > 12) {
            return -1;
        } else {
            return ((feet * 12) + inches) * 2.54;
        }
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if(inches < 0) {
            return -1;
        } else {
            int feet = inches/12;
            int RemainingInches = inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + RemainingInches + " inches.");
            return calcFeetAndInchesToCentimeters(feet,RemainingInches);
        }
    }
}
