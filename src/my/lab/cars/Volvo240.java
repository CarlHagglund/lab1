package my.lab.cars;

import java.awt.*;

public class Volvo240 extends Car implements Movable {

    public boolean IsTurningLeft;
    public boolean IsTurningRight;
    public double CurrX;
    public double CurrY;

    public Volvo240() {
        super(4, Color.black, 100, "Volvo240");
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