package lesson5_8_OOP.lesson7.task6.com.company.vehicles;

import lesson5_8_OOP.lesson7.task6.com.company.details.Engine;
import lesson5_8_OOP.lesson7.task6.com.company.professions.Driver;

public class Car {
    private String brand;
    private String classOfCar;
    private double weight;
    Driver driver;
    Engine engine;

    public Car() {
    }

    public Car(String brand, String classOfCar, double weight, String name, double drivingStage, double power, String manufacturer) {
        this.brand = brand;
        this.classOfCar = classOfCar;
        this.weight = weight;
        this.driver = new Driver(name, drivingStage);
        this.engine = new Engine(power, manufacturer);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getClassOfCar() {
        return classOfCar;
    }

    public void setClassOfCar(String classOfCar) {
        this.classOfCar = classOfCar;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        System.out.println("Поехали");
    }

    public void stop(){
        System.out.println("Останавливаемся");
    }

    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    public void turnRight(){
        System.out.println("Поворот направо");
    }

    public void printInfo(){
        System.out.printf("Марка авто: %s\nКласс авто: %s\nВес авто: %f\nИмя водителя: %s\nСтаж вождения: %f",
                brand, classOfCar, weight, driver.getName(), driver.getDrivingStage());
    }
}
