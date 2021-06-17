package lesson9.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/lesson9/task3/File");
        FileWriter fileWriter = new FileWriter("src/lesson9/task3/File1", false);
        Scanner scanner = new Scanner(fileReader);
        StringBuilder s;
        StringBuilder sNew;

        while (scanner.hasNextLine()){
            s = new StringBuilder(scanner.nextLine());
            sNew = new StringBuilder(s.reverse());
            s.reverse();
            if(s.toString().equals(sNew.toString())){
                fileWriter.write(s + "\n");
            }
        }
        scanner.close();
        fileReader.close();
        fileWriter.close();
    }
}