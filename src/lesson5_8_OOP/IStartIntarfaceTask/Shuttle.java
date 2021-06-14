package lesson5_8_OOP.IStartIntarfaceTask;

import java.util.Random;

public class Shuttle implements IStart{



    @Override
    public boolean checkSystem() {
        Random random = new Random();
        int num = random.nextInt(11 );
        if(num > 3){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void startEngines() {
        System.out.println("Двигатели Шаттла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шаттла");
    }
}
