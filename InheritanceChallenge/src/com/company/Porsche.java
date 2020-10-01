package com.company;

public class Porsche extends Car {

    private int serviceMonths;

    public Porsche( int serviceMonths) {
        super(4, 2, "Porsche", 5, 5, 5, 1);
        this.serviceMonths = serviceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getSpeed() + rate;

        if (newVelocity == 0 ) {
            stop();
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity,getDirection());
        }

    }
}
