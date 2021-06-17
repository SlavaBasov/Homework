package lesson10.task1.util;

import lesson10.task1.Car;
import lesson10.task1.exceptions.OddNumberException;

public class CarHandler {

    public static void handler(Car... cars){
        int countSuccessfull = 0;
        int countUnSuccessfull = 0;
        for(Car car: cars){
            try {
                car.start();
                countSuccessfull++;

            } catch (OddNumberException e) {
                System.out.println(e);
                countUnSuccessfull++;
            }
        }
        System.out.printf("Started %d cars\n", countSuccessfull);
        System.out.printf("Failed %d cars\n", countUnSuccessfull);

    }
}
