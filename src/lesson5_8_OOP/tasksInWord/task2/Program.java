package lesson5_8_OOP.tasksInWord.task2;

public class Program {
    public static void main(String[] args) {
        Person sam = new Person();
        sam.setFullName("Sam");
        sam.setAge(30);
        Person tom = new Person("Tom", 40);
        sam.move();
        sam.talk();
        tom.move();
        tom.talk();

    }
}
