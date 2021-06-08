package lesson5_8_OOP.lesson6.task2;

public class Student {
    private String name;
    private int age;
    private int avScore;

    public Student() {
    }

    public Student(String name, int age, int avScore) {
        this.name = name;
        this.age = age;
        this.avScore = avScore;
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
        this.age = age;
    }

    public int getAvScore() {
        return avScore;
    }

    public void setAvScore(int avScore) {
        this.avScore = avScore;
    }

    public void getInfo(){
        System.out.printf("Имя: %s, Возраст: %d, Рейтинг: %d\n", name, age, avScore);
    }
}
