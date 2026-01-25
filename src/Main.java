import my.lab.cars.Saab95;
import my.lab.cars.Volvo240;

void main() {

    IO.println(String.format("Hello and welcome!"));

    Saab95 saab95 = new Saab95();
    Volvo240 volvo240 = new Volvo240();
    IO.println(String.format("saabfärg = %s", saab95.getColor()));
    IO.println(String.format("volvodörrar = %d", volvo240.getNrDoors()));

    saab95.startEngine();

    IO.println(String.format("x = %f", saab95.getCurrX()));

    IO.println(String.format("currspeed = %f", saab95.getCurrentSpeed()));

    saab95.incrementSpeed(2);

    IO.println(String.format("currspeed = %f", saab95.getCurrentSpeed()));

    saab95.turnLeft();

    saab95.move();

    IO.println(String.format("x = %f", saab95.getCurrX()));

    saab95.turnRight();

    saab95.move();

    IO.println(String.format("y = %f", saab95.getCurrY()));

    saab95.move();

    IO.println(String.format("y = %f", saab95.getCurrY()));

    saab95.brake(2.6);

    saab95.move();

    IO.println(String.format("y = %f", saab95.getCurrY()));





}

