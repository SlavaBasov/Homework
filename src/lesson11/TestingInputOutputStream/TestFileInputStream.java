package lesson11.TestingInputOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TestFileInputStream {
    public static void main(String[] args) {
        byte[] buffer;
        try (FileInputStream fis = new FileInputStream("Test.txt")){
            buffer = new byte[fis.available()];
            int a;
            /*while ((a =  fis.read())!=-1){
                System.out.print((char) a);

            }*/
            fis.read(buffer, 0, buffer.length);
            System.out.println();
            for (byte i: buffer){
                System.out.print((char) i);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
