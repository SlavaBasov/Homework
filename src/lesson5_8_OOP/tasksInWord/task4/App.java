package lesson5_8_OOP.tasksInWord.task4;

public class App {
    public static void main(String[] args) {
        Student tom = new Aspirant("Tom", "Mikles", "23132123", 4.4, "Gaz Stations");
        tom.printInfo();

        System.out.println();
        Student max = new Student("Max", "Fingers", "23132123", 5);
        max.printInfo();

        Student viktor = new Aspirant("Viktor", "Morozov", "23132123", 5, "Fisics");

        System.out.println();
        Student[] students = {tom, max, viktor};

        for(Student s: students){
            s.getScholarship();
        }



    }
}
