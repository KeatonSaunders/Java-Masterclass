package com.company;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20,20,5);

        Case myCase = new Case("21A","Apple","240",dimensions);

        Monitor myMonitor = new Monitor("27inch Beast","Dell",20,new Resolution(2540,1440));

        Motherboard myMotherboard = new Motherboard("AKS","Acer",4,6,"v2.44");

        PC myPC = new PC(myCase,myMonitor,myMotherboard);

        myPC.powerUp();

    }
}
