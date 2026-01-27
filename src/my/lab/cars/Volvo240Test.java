package my.lab.cars;

import org.junitgit .Assert;
import org.junit.Test;


public class Volvo240Test {


    @Test
    public void testStartEngine() {

        Volvo240 sut = new Volvo240();

        sut.startEngine();
        Assert.assertTrue(0.1 == sut.getCurrentSpeed());
    }

    @Test
    public void testTurnLeft() {

        Volvo240 sut = new Volvo240();

        sut.startEngine();
        sut.turnLeft();

        Assert.assertTrue(sut.IsTurningLeft == true);
        Assert.assertTrue(sut.IsTurningRight == false);

    }

    @Test
    public void testTurnRight() {

        Volvo240 sut = new Volvo240();

        sut.startEngine();
        sut.turnRight();

        Assert.assertTrue(sut.IsTurningRight == true);
        Assert.assertTrue(sut.IsTurningLeft == false);

    }

    @Test
    public void testMove() {

        Volvo240 sut = new Volvo240();

        sut.startEngine();
        sut.turnRight();

        Assert.assertTrue(sut.IsTurningRight == true);
        Assert.assertTrue(sut.IsTurningLeft == false);

    }

    @Test
    public void testcurrX() {

        Volvo240 sut = new Volvo240();

        sut.startEngine();
        sut.turnLeft();
        sut.move();
        double currX = sut.CurrX;

        Assert.assertTrue(0.1 == currX);

    }

    @Test
    public void testcurrY() {

        Volvo240 sut = new Volvo240();

        sut.startEngine();
        sut.turnRight();
        sut.move();
        double currY = sut.CurrY;

        Assert.assertTrue(0.1 == currY);

    }

}
