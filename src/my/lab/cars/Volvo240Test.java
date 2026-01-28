package my.lab.cars;

import org.junit.Assert;
import org.junit.Test;


public class Volvo240Test {

    private Volvo240 sut = new Volvo240();


    @Test
    public void testStartEngine() {


        sut.startEngine();
        Assert.assertTrue(0.1 == sut.getCurrentSpeed());
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
        double currXafterMove = sut.getCurrX();
        Assert.assertTrue(currxBeforeMove == 0.0);
        Assert.assertTrue(currXafterMove == 0.1);


    }

    @Test
    public void testcurrX() {


        sut.startEngine();
        sut.turnLeft();
        sut.move();
        double currX = sut.getCurrX();

        Assert.assertTrue(0.1 == currX);

    }

    @Test
    public void testcurrY() {


        sut.startEngine();
        sut.turnRight();
        sut.move();
        double currY = sut.getCurrY();

        Assert.assertTrue(0.1 == currY);

    }

    @Test
    public void testCurrSpeed() {


    }


}
