package lesson11.task4;
/*4) Сеарилизовать объект Автомобиль(Марка, скорость, цена). После
        сериализации произвести обратный процесс.*/

import java.io.*;

public class App {
    public static void main(String[] args) {
        Car car = new Car("Audi", 300, 20000);
        System.out.println(car);
        Serialize.serializeOut(car, "Lesson11Task4Serialize.txt");
        car.setBrand("BMW");
        System.out.println(car);
        car = Serialize.serializeIn("Lesson11Task4Serialize.txt");
        System.out.println(car);
    }
}
