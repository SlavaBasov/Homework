package lesson10.task1.exceptions;

import lesson10.task1.Car;

public class OddNumberException extends Exception{
    private final int number;
    private final String brand;
    private final int speed;
    private final int prise;

    public OddNumberException(int number, String brand, int speed, int prise) {
        this.number = number;
        this.brand = brand;
        this.speed = speed;
        this.prise = prise;
    }

    public int getNumber() {
        return number;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Car " + brand + " start failed(speed = " + speed + ", prise = " + prise +"). The starting number was: " + number;
    }
}
