package lesson5_8_OOP.tasksInWord.task5.com.company.vehicles;

import lesson5_8_OOP.tasksInWord.task5.com.company.details.Engine;
import lesson5_8_OOP.tasksInWord.task5.com.company.professions.Driver;

public class SportCar extends Car{
    private int speed;

    public SportCar() {
    }

    public SportCar(int speed) {
        this.speed = speed;
    }

    public SportCar(String brand, String classOfCar, double weight, int speed) {
        super(brand, classOfCar, weight);
        this.speed = speed;
    }

    public SportCar(String brand, String classOfCar, double weight, Driver driver, Engine engine, int speed) {
        super(brand, classOfCar, weight, driver, engine);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
