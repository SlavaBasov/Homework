package lesson10.task1;

import lesson10.task1.exceptions.OddNumberException;
import lesson10.task1.util.CarHandler;

//Дополнительно вынести бренд машины в Еnum
//Создать CarGenerator(класс с методом)


public class Application {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 200, 5000);
        Car car2 = new Car("Volvo", 250, 10000);
        Car car3 = new Car("Audi", 300, 9000);
        Car car4 = new Car("Honda", 1000, 50000);
        Car[] cars = {car1, car2, car3, car4};

        CarHandler.handler(cars);


    }
}
