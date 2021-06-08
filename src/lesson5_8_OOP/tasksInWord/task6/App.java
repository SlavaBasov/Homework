package lesson5_8_OOP.tasksInWord.task6;

public class App {
    public static void main(String[] args) {
        Horse horse = new Horse("Овес", "Загон", 102.5);
        Cat cat = new Cat("Китикэт", "Квартира", 5);
        Dog dog = new Dog("Корм", "Будка", "Мухтар");
        Veterinarian veterinarian = new Veterinarian();

        Animal[] animals = {horse, cat, dog};
        for (Animal animal: animals){
            veterinarian.treatAnimal(animal);
        }

    }
}
