package com.company;

public class Main {

    public static void main(String[] args) {
        getDurationString(72,12);
        getDurationString(4600);
    }

    public static void getDurationString(int minutes,int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 60) {
            System.out.println("Invalid Value");
        } else {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;

            String hoursString = hours + "h";
            String minutesString = remainingMinutes + "m";
            String secondsString = seconds + "s";

            if (hours < 10) {
                hoursString = "0" + hoursString;
            }

            if (remainingMinutes < 10) {
                minutesString = "0" + minutesString;
            }

            if (seconds < 10) {
                secondsString = "0" + secondsString;
            }

            System.out.println(minutes + " minutes and " + seconds + " seconds = " +
                    hoursString + " " + minutesString + " " + secondsString);
        }
    }

    public static void getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid Value");
        } else {
            int minutes = seconds / 60;
            int newSeconds = seconds % 60;
            getDurationString(minutes,newSeconds);
        }
    }
}
