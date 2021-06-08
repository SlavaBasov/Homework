package lesson5_8_OOP.tasksInWord.task6;

public class Horse extends Animal{
    private double weight;

    public Horse(String food, String location, double weight) {
        super(food, location);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void makeNoise(){
        System.out.println("Лошать ржёт");
    }

    public void eat(){
        System.out.println("Лошать кушает");
    }

    public void sleep(){
        System.out.println("Лошадь спит");
    }


}
