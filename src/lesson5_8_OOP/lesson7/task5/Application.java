package lesson5_8_OOP.lesson7.task5;

public class Application {
    public static void main(String[] args) {
        Student student1 = new Aspirant("Петр", "Иванов", "215615615", 4.2, "Вентиляция");
        Student student2 = new Student("Витя", "Васильев", "12312123123", 4.5);
        Student student3 = new Aspirant("Вася", "Пупкин", "123124445", 5, "Станции");

        Student[] students = {student1, student2, student3};

        for(Student student: students){
            System.out.println(student.getScolarship());
        }



    }
}
