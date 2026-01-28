package my.lab.cars;

import java.awt.*;

public class Car {

    // Privata för att de inte ska kunna förändras eller kallas på direkt. Säkerhet

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

        // Denna kallas för att öka farten på bilen. Den skall raise:a error om kriteriet uppfylls.

    }

    public void decrementSpeed(double amount) {

        double currentSpeedtest = getCurrentSpeed() - speedFactor() * amount;

        if (currentSpeedtest >= 0 && currentSpeedtest <= enginePower) {
            currentSpeed = currentSpeedtest;

        } else {
            throw new IllegalArgumentException("Speed " + currentSpeedtest + " is out of range!");
        }
        // Samma som increment cred till Calle
    }

    public void gas(double amount) {
        if (amount < 0.0 || amount > 1.0)
            throw new IllegalArgumentException(
                    "amount must be between 0.0 and 1.0. " + amount
            );

        incrementSpeed(amount);
    } // lite samma visa här men om den inte raise:ar exception så kallas incrementSpeed()

    public void brake(double amount) {
        if (amount < 0.0 || amount > 1.0 || amount > currentSpeed)
            throw new IllegalArgumentException(
                    "amount must be between 0.0 and 1.0. and can't be greater than current speed "
            );

        decrementSpeed(amount);
        // Samma som innan men nu kallas decrementSpeed(), cred till mig, cool, Øhl osv <3
    }
}
