package com.company;

class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "Car --> starting engine";
    }

    public String accelerate() {
        return "Car --> accelerate";
    }

    public String brake() {
        return "Car --> brake";
    }

}

class Mitsubishi extends Car {

    public Mitsubishi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi --> start engine";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi --> accelerate";
    }

    @Override
    public String brake() {
        return "Mitsubishi --> brake";
    }
}

class Ford {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Ford(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "Ford --> starting engine";
    }

    public String accelerate() {
        return "Ford --> accelerate";
    }

    public String brake() {
        return "Ford --> brake";
    }

}

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Base car",8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi("Pajero",6);
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford("Focus",6);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

    }

}
