package lesson5_8_OOP.tasksInWord.task5.com.company.vehicles;

import lesson5_8_OOP.tasksInWord.task5.com.company.details.Engine;
import lesson5_8_OOP.tasksInWord.task5.com.company.professions.Driver;

public class Lorry extends Car{
    private int carrying;

    public Lorry(int carrying) {
        this.carrying = carrying;
    }

    public Lorry(String brand, String classOfCar, double weight, int carrying) {
        super(brand, classOfCar, weight);
        this.carrying = carrying;
    }

    public Lorry(String brand, String classOfCar, double weight, Driver driver, Engine engine, int carrying) {
        super(brand, classOfCar, weight, driver, engine);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }
}
