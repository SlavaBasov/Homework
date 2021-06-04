package lesson4_5.lesson4;

public class Person {
    private int age;
    private String name;
    private static int counter;

    static {
        counter = 0;
    }

    public Person() {
        counter++;
    }

    public Person(int age1) {
        age = age1;
        counter++;
    }

    public Person(int age2, String name) {
        age = age2;
        this.name = name;
        counter++;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.printf("Person%d:  age: %d   name: %s\n", counter, age, name);
    }

    public static int getCounter() {
        return counter;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int... a) {
        int sum = 0;
        for(int i: a){
            sum += i;
        }
        return sum;
    }

    public static double sum(double a, double b) {
        return a + b;
    }


}