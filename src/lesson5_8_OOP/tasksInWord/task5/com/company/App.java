package lesson5_8_OOP.tasksInWord.task5.com.company;

import lesson5_8_OOP.tasksInWord.task5.com.company.details.Engine;
import lesson5_8_OOP.tasksInWord.task5.com.company.professions.Driver;
import lesson5_8_OOP.tasksInWord.task5.com.company.vehicles.Car;

public class App {
    public static void main(String[] args) {
        Engine engine = new Engine(2.2, "BMW");
        Driver driver = new Driver("Петрович", 5);
        Car car = new Car("BMW", "M3", 900, driver, engine);

        car.printInfo();
        car.start();
        car.turnLeft();
        car.turnRight();
        car.stop();
        System.out.println(driver.toString());

    }
}
