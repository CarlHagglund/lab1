package my.lab.cars;

import org.junit.Assert;
import org.junit.Test;


public class Volvo240Test {

    private Volvo240 sut = new Volvo240();


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
        double currXafterMove = sut.getCurrX();
        Assert.assertTrue(currxBeforeMove == 0.0);
        Assert.assertTrue(currXafterMove == 0.1);


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
    public void testCurrSpeed() {


    }


    @Test
    public void testBrake() {

        Volvo240 sut = new Volvo240();

        double speedBefore = sut.getCurrentSpeed();

        sut.brake(0.5);

        double brake = sut.getCurrentSpeed();




    }
}
