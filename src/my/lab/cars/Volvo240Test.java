package my.lab.cars;

import org.junit.Assert;
import org.junit.Test;


public class Volvo240Test {


    @Test
    public void testStartEngine() {

        Volvo240 sut = new Volvo240();

        sut.startEngine();
        Assert.assertEquals(0.1, sut.getCurrentSpeed(), 0.0);
    }

    @Test
    public void testTurnLeft() {

        Volvo240 sut = new Volvo240();

        sut.startEngine();
        sut.turnLeft();

        Assert.assertTrue(sut.IsTurningLeft);
        Assert.assertFalse(sut.IsTurningRight);

    }

    @Test
    public void testTurnRight() {

        Volvo240 sut = new Volvo240();

        sut.startEngine();
        sut.turnRight();

        Assert.assertTrue(sut.IsTurningRight);
        Assert.assertFalse(sut.IsTurningLeft);

    }

    @Test
    public void testMove() {

        Volvo240 sut = new Volvo240();

        sut.startEngine();
        sut.turnRight();

        Assert.assertTrue(sut.IsTurningRight);
        Assert.assertFalse(sut.IsTurningLeft);

    }

    @Test
    public void testCurrX() {

        Volvo240 sut = new Volvo240();

        sut.startEngine();
        sut.turnLeft();
        sut.move();
        double currX = sut.CurrX;

        Assert.assertEquals(0.1, currX, 0.0);

    }

    @Test
    public void testCurrY() {

        Volvo240 sut = new Volvo240();

        sut.startEngine();
        sut.turnRight();
        sut.move();
        double currY = sut.CurrY;

        Assert.assertEquals(0.1, currY, 0.0);
    }
    @Test
    public void testGas() {

        Volvo240 sut = new Volvo240();
        Volvo240 but = new Volvo240();

        double speedBefore = sut.getCurrentSpeed();

        //sut.gas(2.0);
        but.gas(0.5);

        double gas1 = sut.getCurrentSpeed();
        double gas2 = but.getCurrentSpeed();


        Assert.assertEquals(speedBefore, gas1, 0.0);
        Assert.assertTrue(gas2 > speedBefore);
    }

    @Test
    public void testBrake() {

        Volvo240 sut = new Volvo240();

        double speedBefore = sut.getCurrentSpeed();

        sut.brake(0.5);

        double brake = sut.getCurrentSpeed();




    }
}
