package my.lab.cars;

import java.awt.*;


public class Scania extends Car implements Flatbed {

    private int CurrFlatbedAngle;

    public Scania() {
        super(2, Color.red, 770, "Scania");
        this.CurrFlatbedAngle = 0;
    }

    @Override
    public void move() {
        if (CurrFlatbedAngle == 0) {
            super.move();
        }
        else IO.println("Flatbed is not lowered! Flatbed angle must be 0");
    }

    public void turnLeft() {
        super.turnLeft();
    }

    public void turnRight() {
        super.turnRight();
    }

    @Override
    public void ChangeFlatbedAngle(int amount) {
        if (super.getCurrentSpeed() != 0) {
            IO.println("Truck is moving, can't change flatbed angle");
            }
        else if (amount < 0 || amount > 70) {
            throw new IllegalArgumentException(
                    "Value must be between 0 and 70");
            }
        else CurrFlatbedAngle = amount;

}
    public double getCurrFlatbedAngle() {
        return CurrFlatbedAngle;
    }

}
