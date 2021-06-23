package lesson11;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileReader {
    public static void main(String[] args) {
        try(FileReader fin = new FileReader("Lesson11Text.txt");
            FileWriter fr = new FileWriter("Lesson11Text2.txt")){
            /*Buffer buffer = new Buffer();
            fin.read(buffer, 0, fin.available());*/
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
