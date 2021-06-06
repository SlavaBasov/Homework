package lesson4_5.tasksInWord.task5.com.company.vehicles;

import lesson4_5.tasksInWord.task5.com.company.details.Engine;
import lesson4_5.tasksInWord.task5.com.company.professions.Driver;

public class Car {
    private String brand;
    private String classOfCar;
    private double weight;
    private Driver driver = new Driver();
    private Engine engine = new Engine();

    public Car() {
    }

    public Car(String brand, String classOfCar, double weight) {
        this.brand = brand;
        this.classOfCar = classOfCar;
        this.weight = weight;
    }

    public Car(String brand, String classOfCar, double weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.classOfCar = classOfCar;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start(){
        System.out.println("Поехали");
    }

    public void stop(){
        System.out.println("Останавливаемся");
    }

    public void turnRight(){
        System.out.println("Поворот направо");
    }

    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    public void printInfo(){
        System.out.printf("Марка: %s\tКласс: %s\tВес: %2.1f\nВодитель: %s, лет стажа: %2.1f\tМотор: %s %2.1f л.с.\n",
                brand, classOfCar, weight, driver.getFullName(), driver.getDrivingExp(), engine.getManufacturer(), engine.getCapacity());
    }


}
