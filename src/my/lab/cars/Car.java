package my.lab.cars;

import java.awt.*;

public class Car {

    // Make class variables private, not to be changed by user

    private boolean turboOn;
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name

    public Car(int nrDoors, Color color, double enginePower, String modelName) {
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        turboOn = false;
        this.modelName = modelName;
        stopEngine(); // set the moving speed to 0
    }

    public int getNrDoors() {
        return nrDoors;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color clr) {
        color = clr;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }

    public void setTurboOn() {
        turboOn = true;
    }

    public void setTurboOff() {
        turboOn = false;
    }

    public double speedFactor() {
        double turbo = 1;
        if (turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

    public void incrementSpeed(double amount) {
        double currentSpeedtest = getCurrentSpeed() + speedFactor() * amount;

        if (currentSpeedtest >= 0 && currentSpeedtest <= enginePower) {
            currentSpeed = currentSpeedtest;

        } else {

            throw new IllegalArgumentException("Speed " + currentSpeedtest + " is out of range!");
        }


    }

    public void decrementSpeed(double amount) {

        double currentSpeedtest = getCurrentSpeed() - speedFactor() * amount;

        if (currentSpeedtest >= 0 && currentSpeedtest <= enginePower) {
            currentSpeed = currentSpeedtest;

        } else {
            throw new IllegalArgumentException("Speed " + currentSpeedtest + " is out of range!");
        }


    }

    public void gas(double amount) {
        if (amount < 0.0 || amount > 1.0)
            throw new IllegalArgumentException(
                    "amount must be between 0.0 and 1.0. " + amount
            );

        incrementSpeed(amount);
    }

    public void brake(double amount) {
        if (amount < 0.0 || amount > 1.0)
            throw new IllegalArgumentException(
                    "amount must be between 0.0 and 1.0. " + amount

            );
        decrementSpeed(amount);
    }
}
