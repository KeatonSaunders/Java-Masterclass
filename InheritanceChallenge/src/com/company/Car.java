package com.company;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private int isManual;
    private int currentGear;

    public Car(int length, int width, String make, int wheels, int doors, int gears, int isManual) {
        super(length, width, make);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Gear changed to " + currentGear);
    }

    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("Car.changeVelocity(): " + speed + ", Direction: " + direction);
    }
}
