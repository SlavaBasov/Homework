package lesson4_5.tasksInWord.task6;

public class Veterinarian {
    public void treatAnimal(Animal animal){
        System.out.printf("Пища: %s,  откуда прибыли: %s\n", animal.getFood(), animal.getLocation());
    }
}
