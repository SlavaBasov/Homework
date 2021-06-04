package lesson4_5.lesson5.task2;

public class App {
    public static void main(String[] args) {


        Group group1 = new Group("165156");
        Student[] arr = new Student[4];
        arr[0] = new Student("Петрович", 80, 2);
        arr[1] = new Student("Василич", 44, 1);
        arr[2] = new Student("Мария Ивановна", 65, 3);
        arr[3] = new Student("Бомж Игорь", 54, 4);
        group1.setStudents(arr);

        group1.getInfo();
    }
}
