package lesson4_5.lesson5.task1;

public class Human {
    private String name;
    private int age;
    private int weight;
    private int height;
    private Ability speed = new Ability();

    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }

    public Human(Ability speed) {
        this.speed = speed;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Human(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            this.age = 5;
            System.out.println("Ты еще маленький");
        } else {
            this.age = age;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Ability getSpeed(){
        return speed;
    }

    public void setSpeed(String name){
        this.speed = new Ability(name);
    }

    public void printInfo(){
        System.out.printf("Name: %s\nAge: %d\nWeight: %d\nHeight: %d\nMass index: %f\nAbility: %s\n", name, age, weight, height, countIndex(), speed.getName());
    }

    public void printInfoM(){
        if(name != null){
            System.out.printf("Name: %s\n", name);
        }
        if(age != 0){
            System.out.printf("Age: %s\n", age);
        }
        if(weight != 0){
            System.out.printf("Weight: %d\n", weight);
        }
        if(height != 0){
            System.out.printf("Height: %d\n", height);
        }
        if(height != 0 || weight != 0){
            System.out.printf("Mass index: %f\n", countIndex());
        }
        if(speed != null){
            System.out.printf("Ability: %s\n", speed.getName());
        }

    }

    private double countIndex(){
        return (double) height / weight;
    }
}
