package lesson10.task1;

import lesson10.task1.exceptions.OddNumberException;
import lesson10.task1.util.CarGenerator;
import lesson10.task1.util.CarHandler;

//Дополнительно вынести бренд машины в Еnum
//Создать CarGenerator(класс с методом)


public class Application {
    public static void main(String[] args) {
        CarGenerator carGenerator = new CarGenerator();
        Car[] cars = new Car[10];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = carGenerator.generate();
        }

        CarHandler.handler(cars);


    }
}
