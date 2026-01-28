package my.lab.cars;

import java.awt.*;

public class Saab95 extends Car implements Movable {
// Denna ser exakt ut som Volvo240 klassen :/
    private boolean IsTurningLeft;
    private boolean IsTurningRight;
    private double CurrX;
    private double CurrY;

    public Saab95() {
        super(2, Color.red, 125, "Saab95");
    }

    @Override
    public void move() {
        if (IsTurningLeft) {
            CurrX += super.getCurrentSpeed();
        } else if (IsTurningRight) {
            CurrY += super.getCurrentSpeed();
        }

    }

    @Override
    public void turnLeft() {
        IsTurningLeft = true;
        IsTurningRight = false;
    }

    @Override
    public void turnRight() {
        IsTurningRight = true;
        IsTurningLeft = false;
    }

    public double getCurrX() {
        return CurrX;
    }

    public double getCurrY() {
        return CurrY;
    }

}