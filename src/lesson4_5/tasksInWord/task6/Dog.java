package lesson4_5.tasksInWord.task6;

public class Dog extends Animal{
    private String name;

    public Dog(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("Собака гавкает");
    }

    public void eat(){
        System.out.println("Собака кушает");
    }

    public void sleep(){
        System.out.println("Собака спит");
    }
}
