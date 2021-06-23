package lesson11;

import java.io.*;

public class TestBufferedReader {
    public static void main(String[] args) {
        try (BufferedReader fileIn = new BufferedReader(new FileReader("Lesson11Text.txt"));
        BufferedWriter fileOut = new BufferedWriter(new FileWriter("Lesson11Text.txt"))){
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
