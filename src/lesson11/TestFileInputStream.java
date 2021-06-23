package lesson11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.Buffer;

public class TestFileInputStream {
    public static void main(String[] args) {
        try(FileInputStream fin = new FileInputStream("Lesson11Text.txt")){
            /*Buffer buffer = new Buffer();
            fin.read(buffer, 0, fin.available());*/
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
