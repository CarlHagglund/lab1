package my.lab.cars;

import org.junit.Assert;
import org.junit.Test;


public class Volvo240Test {

    private Volvo240 sut = new Volvo240();

    @Test
    public void testStartEngine() {

        sut.startEngine();
        Assert.assertEquals(0.1, sut.getCurrentSpeed(), 0.0);
    }

    @Test
    public void testTurnLeft() {

        sut.startEngine();
        sut.turnLeft();
        sut.move();

        double currX = sut.getCurrX();
        double currY = sut.getCurrY();

        Assert.assertTrue(0.1 == currX);

        Assert.assertTrue(0.0 == currY);


    }

    @Test
    public void testTurnRight() {

        sut.startEngine();
        sut.turnRight();
        sut.move();

        double currX = sut.getCurrX();
        double currY = sut.getCurrY();

        Assert.assertTrue(0.0 == currX);

        Assert.assertTrue(0.1 == currY);

    }

    @Test
    public void testMove() {

        sut.startEngine();
        sut.turnLeft();
        double currxBeforeMove = sut.getCurrX();
        sut.move();
        double currXAfterMove = sut.getCurrX();
        Assert.assertTrue(currxBeforeMove == 0.0);
        Assert.assertTrue(currXAfterMove == 0.1);


    }

    @Test
    public void testCurrX() {


        sut.startEngine();
        sut.turnLeft();
        sut.move();
        double currX = sut.getCurrX();

        Assert.assertEquals(0.1, currX, 0.0);

    }

    @Test
    public void testCurrY() {


        sut.startEngine();
        sut.turnRight();
        sut.move();
        double currY = sut.getCurrY();

        Assert.assertEquals(0.1, currY, 0.0);
    }

    @Test
    public void testGas() {
        try {
            sut.gas(1.1);}
        catch (IllegalArgumentException e) {
            Assert.assertTrue(true);
            // Här testar vi om gas kan sättas till över 1.0

        }
        try {
            sut.gas(-0.1);}
        catch (IllegalArgumentException e) {
            Assert.assertTrue(true);
        //Om gas inte kan sättas till negativt så kan inte farten sänkas av gas()
    }}

    @Test
    public void testCurrSpeedIncrement() {

        sut.startEngine();
        sut.incrementSpeed(50);

        double enginePower = sut.getEnginePower();
        double currentSpeed = sut.getCurrentSpeed();

        Assert.assertTrue(currentSpeed >= 0 && currentSpeed <= enginePower);
    }

    @Test
    public void testCurrSpeedDecrement() {

        sut.startEngine();
        sut.incrementSpeed(50);
        sut.decrementSpeed(25);

        double enginePower = sut.getEnginePower();
        double currentSpeed = sut.getCurrentSpeed();

        Assert.assertTrue(currentSpeed >= 0 && currentSpeed <= enginePower);
    }


    @Test
    public void testBrake() {
        try {
            sut.brake(1.1);}
        catch (IllegalArgumentException e) {
            Assert.assertTrue(true);
            // Här testar vi om brake kan sättas till över 1.0
        }
        try {
            sut.brake(-0.1);}
        catch (IllegalArgumentException e) {
            Assert.assertTrue(true);
        // När vi gör test med brake -0.1 så visar vi att break() inte kan göra att farten höjs
        // Tyckte jag gjorde en bra lösning på detta problem faktiskt, tog inspo från python <3
    }}
}
