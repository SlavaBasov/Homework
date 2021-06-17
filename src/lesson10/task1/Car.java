package lesson10.task1;

import lesson10.task1.exceptions.OddNumberException;

import java.util.Random;

public class Car {
    private String brand;
    private double speed;
    private double price;

    public Car() {
    }

    public Car(String brand, double speed, double price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void start() throws OddNumberException {
        Random random = new Random();
        int num = random.nextInt(21);
        if(num % 2 == 0){
            throw new OddNumberException(num, brand);
        } else {
            System.out.printf("Car %s started successfully\n", brand);
        }

    }
}
