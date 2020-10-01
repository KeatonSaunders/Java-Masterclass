package com.company;

public class Vehicle {

    private int speed;
    private int direction;
    private int length;
    private int width;
    private String make;

    public Vehicle(int length, int width, String make) {
        this.speed = 0;
        this.direction = 0;
        this.length = length;
        this.width = width;
        this.make = make;
    }

    public void steer(int direction) {
        this.direction += direction;
        System.out.println("Vehicle is now steering at " + direction + " degrees.");
    }

    public void move(int direction, int speed) {
        this.direction = direction;
        this.speed = speed;
        System.out.println("Vehicle moving at " + speed + " direction " + direction);
    }

    public void stop () {
        this.speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDirection() {
        return direction;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getMake() {
        return make;
    }
}
