package lesson11.task1;
// создать приватный метод IsPolyndrom
import lesson11.task1.service.FileHandler;

/*1)В исходном файле находятся слова, каждое слово на новой стороке. После
        запуска программы должен создать файл, который будет содержать в себе
        только полиндромы*/
public class App {
    public static void main(String[] args) {
        String[] words = FileHandler.readFile("Lesson11Task1File.txt");
        FileHandler.writeFile("Lesson11Task1FileNew.txt", words);


    }
}
