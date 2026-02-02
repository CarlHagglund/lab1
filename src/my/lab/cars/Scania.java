package my.lab.cars;

import java.awt.*;

public class Scania extends Car {

    private double flatBeadAngle;

    public Scania() {
        super(2, Color.red, 770, "Scania");

    }

    @Override
    public void move() {
        if (flatBeadAngle == 0) {
            super.move();
        }
        IO.println("Flatbed angle too high! lower flatbed to move");
    }

    public void turnLeft() {
        super.turnLeft();
    }

    public void turnRight() {
        super.turnRight();
    }

    public void raiseFlatbed(double amount) {
        if (super.getCurrentSpeed() != 0) {
            throw new IllegalArgumentException("Cannot lower flatbed while moving!");
        }
        double currFlatBedAngle = flatBeadAngle + amount;

        if (0 <= currFlatBedAngle && currFlatBedAngle <= 70) {
            flatBeadAngle = currFlatBedAngle;
        } else {
            throw new IllegalArgumentException(currFlatBedAngle + " is an invalid angle!");
        }
    }

    public void lowerFlatbed(double amount) {
        if (super.getCurrentSpeed() != 0) {
            throw new IllegalArgumentException("Cannot lower flatbed while moving!");
        }
        double currFlatBedAngle = flatBeadAngle + (-amount);

        if (0 <= currFlatBedAngle && currFlatBedAngle <= 70) {
            flatBeadAngle = currFlatBedAngle;
        } else {
            throw new IllegalArgumentException(currFlatBedAngle + " is an invalid angle!");
        }
    }

    public double getflatBedAngle() {
        return flatBeadAngle;
    }

}
