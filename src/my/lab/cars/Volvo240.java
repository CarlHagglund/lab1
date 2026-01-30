package my.lab.cars;

import java.awt.*;

public class Volvo240 extends Car implements Movable {

    /* Här använder vi inhertance när vi "extends Car"
    // Nu kan vi skapa instance objekt så att Car car1 = new Volvo240
    Car objekten är subtyper men kan fortfarande ses som "Car" objekt
    */

    private boolean IsTurningLeft;
    private boolean IsTurningRight;
    private double CurrX;
    private double CurrY;

    // attributer för riktning och koordinater

    public Volvo240() {
        super(4, Color.black, 100, "Volvo240");
    }
    // Här visar vi vad som händer om vi kallar superklassen för att skapa en Volvo240 med dessa attributer.


    @Override
    // @Override gör så att denna metod används för subklassen och inte den från superklassen
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
// två getter funktioner bara :)
    public double getCurrY() {
        return CurrY;
    }

}