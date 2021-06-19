package lesson10.task1.util;

import lesson10.task1.Car;
import lesson10.task1.enums.Brands;

import java.util.Random;

public class CarGenerator {

    public Car generate(){
        int speed;
        int prise;
        Random random = new Random();
        speed = random.nextInt(301) + 100;
        speed -= speed % 10;
        prise = random.nextInt(95001) + 5000;
        prise -= prise % 100;


        Car car = new Car((Brands.values())[random.nextInt(Brands.values().length)].toString(),
                speed, prise);
        return car;
    }
}