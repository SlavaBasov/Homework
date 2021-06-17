package lesson9.task4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("src/lesson9/task4/File");
        Scanner scanner = new Scanner(reader);
        FileWriter writer = new FileWriter("src/lesson9/task4/NewFile");
        String line;
        line = scanner.nextLine();
        System.out.println(TextFormater.numOfWordsInString(line));



        /*while (scanner.hasNextLine()){
            line = scanner.nextLine();
        }*/


        reader.close();
        writer.close();
        scanner.close();
    }
}
