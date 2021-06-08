package lesson5_8_OOP.tasksInWord.task6;

public class Cat extends Animal{
    private int age;

    public Cat(String food, String location, int age) {
        super(food, location);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeNoise(){
        System.out.println("Кот мяукает");
    }

    public void eat(){
        System.out.println("Кот кушает");
    }

    public void sleep(){
        System.out.println("Кот спит");
    }
}
